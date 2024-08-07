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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("From connect_dataBase");
            Connection con = connection_dataBase.initializeDatabase();

            PreparedStatement st = con.prepareStatement("Insert into user_data values (?,?,?,?,?)");

            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String email = request.getParameter("email");
            String number = request.getParameter("number");

            st.setString(1, id);

            st.setString(2, name);

            st.setString(3, age);

            st.setString(4, email);

            st.setString(5, number);

            st.executeUpdate();

            st.close();
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<html><head><style>"
                    + "body { font-family: Arial, sans-serif; background-color: #f0f0f0; color: #333; }"
                    + "h1 { color: #4CAF50; text-align: center; }"
                    + "h4 { color: #555; }"
                    + "div.container { margin: auto; padding: 20px; width: 50%; background-color: white; box-shadow: 0px 0px 10px rgba(0,0,0,0.1); }"
                    + "</style></head><body>"
                    + "<div class='container'>"
                    + "<h1>Successfully inserted your data</h1>\n"
                    + "<h4>Id: " + id + "</h4>\n"
                    + "<h4>Name: " + name + "</h4>\n"
                    + "<h4>Age: " + age + "</h4>\n"
                    + "<h4>Email: " + email + "</h4>\n"
                    + "<h4>Mobile number: " + number + "</h4>\n"
                    + "</div></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
