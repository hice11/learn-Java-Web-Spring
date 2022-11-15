package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s51012")
public class Servlet5  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table{ width:300px;  border:1px solid black ;}");
		out.println("td { border:1px solid black ;}");
		out.println("</style>");

		out.println("</head>");
		out.println("<body>");
		out.println("<table>");

		for( int i=1; i<=3 ; i++) {
			out.println("<tr>");
			out.println("<td>a </td>");
			out.println("<td>b </td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");


	}
}

