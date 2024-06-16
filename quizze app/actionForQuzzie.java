import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/actionForQuzzie")
public class actionForQuzzie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public actionForQuzzie() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int cnt = 0;
		String c = request.getParameter("CPU");
		String a = request.getParameter("programming");
		String p = request.getParameter("counting");
		
		if(c != null && c.equals("cpu")) {
			out.println("Your Answer is correct</br>");
			cnt++;
		} else {
			out.println("The correct answer is CPU");
		}
		
		if(a != null && a.equals("programming")) {
			out.println("Your Answer is correct</br>");
			cnt++;
		} else {
			out.println("The correct answer is Programming");
		}
		
		if(p != null && p.equals("countingSort")) {
			out.println("Your Answer is correct</br>");
			cnt++;
		} else {
			out.println("The correct answer is Counting sort");
		}
		
		if(cnt == 3) {
			out.println("<h1>Your all answer is correct</h1></br>");
		} else {
			out.println("<h1>You have scored</h1></br>" + cnt);
		}				
	}
}
