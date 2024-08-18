package com.jdbc_project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc_project.jdbc_connector;

@WebServlet("/data_input")
public class data_input extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public data_input() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain"); // Set response type

        try {
            System.out.println("Connecting to Database...");

            // Initialize the database
            Connection con = jdbc_connector.initializeDatabase();

            // Prepare the SQL statement
            PreparedStatement st = con
                    .prepareStatement("INSERT INTO data (name, age, email, mobile_number) VALUES (?, ?, ?, ?)");

            // Get the data from the request
            String name = request.getParameter("nameInput");
            String age = request.getParameter("ageInput");
            String email = request.getParameter("emailInput");
            String number = request.getParameter("mobileInput");

            // Set the data in the PreparedStatement
            st.setString(1, name);
            st.setString(2, age);
            st.setString(3, email);
            st.setString(4, number);

            // Execute the update
            st.executeUpdate();

            System.out.println("Data inserted: " + name + " " + age);

            // Close the PreparedStatement and Connection
            st.close();
            con.close();

            // Send a response to the client
            PrintWriter out = response.getWriter();
            out.println("Data successfully inserted!");

        } catch (SQLException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            PrintWriter out = response.getWriter();
            out.println("Error: Unable to insert data.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
