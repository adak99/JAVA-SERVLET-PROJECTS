
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registraion_form_project.connection_dataBase;

@WebServlet("/userInput")
public class userInput extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public userInput() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("From connect_dataBase");
            Connection con = connection_dataBase.initializeDatabase();

            PreparedStatement st = con.prepareStatement("Insert into user_data values (?,?,?,?,?)");

            st.setString(1, request.getParameter("id"));

            st.setString(2, request.getParameter("name"));

            st.setString(3, request.getParameter("age"));

            st.setString(4, request.getParameter("email"));

            st.setString(5, request.getParameter("number"));

            st.executeUpdate();

            st.close();
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<html><body>Successfully insert" + "</br></body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
