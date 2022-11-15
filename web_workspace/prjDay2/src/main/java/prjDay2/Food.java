package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food")
public class Food extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num = request.getParameter("food");
		int pNum = Integer.parseInt(num);

		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<style> img{width:300px; height:300px;} div{text-align:center;}</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div>");
		if (pNum == 1) {
			out.print("<img src= food1.jpeg>");
		} else if (pNum == 2) {
			out.print("<img src = food2.jpeg>");
		} else if (pNum == 3) {
			out.print("<img src = food3.jpeg>");
		} else {

		}
		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
	}
}