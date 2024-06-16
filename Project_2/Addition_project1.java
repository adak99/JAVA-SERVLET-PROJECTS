import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition_project1
 */
@WebServlet("/Addition_project1")
public class Addition_project1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition_project1() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String number = request.getParameter("mobileNumber");
        // int mobileNumber;
        // try {
        // mobileNumber = Integer.parseInt(request.getParameter("mobileNumber"));
        // } catch (NumberFormatException e) {
        // // Handle the exception
        // response.setContentType("text/html"); // Set content type for error message
        // PrintWriter out = response.getWriter();
        // out.println("Error: Invalid number format. Please enter numbers only.");
        // return;
        // }

        String email = request.getParameter("email");
        // String gender = request.getParameter("gender");

        // int number;
        // try {
        // number = Integer.parseInt(request.getParameter("nmber"));
        // } catch (NumberFormatException e) {
        // response.setContentType("text/html");
        // PrintWriter out = response.getWriter();
        // out.println("Error: Invalid age format. Please enter numbers only.");
        // return;

        // }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Your Details</h1>");
        out.println("Your name: " + firstName + " " + lastName);
        out.println("<br> Your mobile number: " + number + "\n");
        out.println("<br> Your email: " + email + "\n");
        // out.println("Your: " + gender + "\n");

        // Add your calculator functionality here (if applicable)
    }
}
