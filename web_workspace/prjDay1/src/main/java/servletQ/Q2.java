package servletQ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q2.ch")
public class Q2 extends HttpServlet {

	//3단 제공하기 (3단 제공하는 서비스)
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		//처리
		String[] gugu = new String[9];
		for (int i = 1; i <= 9; i++) {
			gugu[i-1] = "3 x "+i+" = "+(3*i);
		}
		//출력
		PrintWriter out = response.getWriter();
		
		out.write("");
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>"); 
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>"); 
		out.write("<Style>");
		out.write("body{"); 
		out.write(" background-color: black;"); 
		out.write(" margin:0 auto;");
		out.write("}");
		out.write("div{"); 
		out.write(" width:200px;"); 
		out.write(" height:360px;");
		out.write(" border: 1px solid white;");
		out.write(" color:white;"); 
		out.write(" font-size:20px;"); 
		out.write(" font-width:bold;");
		out.write(" text-align:center;");
		out.write(" vertical-align: middle;");
		out.write(" padding:10px 5px;");
		out.write(" margin:10px auto;");
		out.write(" line-height: 30px;");
		out.write("}"); 
		out.write("</Style>");
		out.write("</head>"); 
		out.write("<body>");
		out.write("<div>");
		out.write("<h3>구구단 3단</h3>");
		for (int i = 0; i < gugu.length; i++) {
			out.write(gugu[i]+"<br>");
		}
		out.write("</div>"); 
		out.write("</body>"); 
		out.write("</html>");
		
	}
	
	
}
