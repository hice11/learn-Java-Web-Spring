package prjDay1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcpage")
public class ServletHTML extends HttpServlet {
	@Override protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter(); 
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>"); 
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>"); 
		out.write("<Style>"); 
		out.write("input{"); 
		out.write(" width:50px;"); 
		out.write(" height:50px;"); 
		out.write("}");
		out.write(".output{"); 
		out.write(" height:50px;");
		out.write(" backgroud: #e9e9e9;"); 
		out.write(" font-size:24px;"); 
		out.write(" font-width:bold;");
		out.write(" text-align:right;");
		out.write(" padding:0px 5px;");
		out.write("}"); 
		out.write("</Style>");
		out.write("</head>"); 
		out.write("<body>");
		out.write(" <form   method=\"post\">"); 
		out.write(" <table>"); 
		out.write(" <tr>");
		out.printf(" <td class=\"output\" colspan=\"4\">%d</td>", 10+5);
		out.write(" </tr>"); 
		out.write(" <tr>");
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"CE\"></td>");
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"C\"></td>");
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"BS\"></td>");
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"÷\"></td>"); 
		out.write(" </tr>"); 
		out.write(" <tr>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"7\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"8\"></td>");
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"9\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"X\"></td>"); 
		out.write(" </tr>"); 
		out.write(" <tr>");
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"4\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"5\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"6\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"-\"></td>");
		out.write(" </tr>");
		out.write(" <tr>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"1\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"2\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"3\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\\"+"></td>");
		out.write(" </tr>"); 
		out.write(" <tr>"); 
		out.write(" <td></td>"); 
		out.write(" <td><input type=\"submit\" name=\"number\" value=\"0\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"dot\" value=\".\"></td>"); 
		out.write(" <td><input type=\"submit\" name=\"operator\" value=\"=\"></td>");
		out.write(" </tr>");
		out.write(" </table>");
		out.write(" </form>");
		out.write("</body>"); 
		out.write("</html>");   

	}

}
