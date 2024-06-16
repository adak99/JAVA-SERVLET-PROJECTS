package com.insertdata.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase_Connection_fist_project.connect_database;

@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InsertData() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            System.out.println("From connect_database");
            Connection con = connect_database.initializeDatabase();

            PreparedStatement st = con
                    .prepareStatement("insert into demo values(?, ?)");

            st.setInt(1, Integer.valueOf(request.getParameter("id")));

            st.setString(2, request.getParameter("string"));

            st.executeUpdate();

            st.close();
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
