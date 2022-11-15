package servletQ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q5.ch")
public class Q5 extends HttpServlet {

	//원하는 수만큼의 별을 출력하기 (원하는 수만큼 별을 출력하는 서비스제공하기)
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//입력
		String n_ = request.getParameter("n");
		int n = Integer.parseInt(n_);
		//처리
		String star="";
		for (int i = 0; i < n; i++) {
			star += "★";
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
		out.write(" width:300px;"); 
		out.write(" border: 1px solid white;");
		out.write(" color:lightyellow;"); 
		out.write(" font-size:20px;"); 
		out.write(" font-width:bold;");
		out.write(" text-align:center;");
		out.write(" vertical-align: middle;");
		out.write(" padding:10px 5px;");
		out.write(" margin:10px auto;");
		out.write("}"); 
		out.write("h4{"); 
		out.write(" margin:10px auto;");
		out.write(" color:white;"); 
		out.write("}");
		out.write("span{"); 
		out.write(" color:lightyellow;"); 
		out.write(" font-size:40px;"); 
		out.write(" line-height: 60px;");
		out.write(" word-break:break-all;");
		out.write("}");
		out.write("</Style>");
		out.write("</head>"); 
		out.write("<body>");
		out.write("<div>");
		out.write("<h4> 별 출력하기 </h4>");
		out.write("<span>"+ star +"</span>");
		out.write("</div>"); 
		out.write("</body>"); 
		out.write("</html>");
		
		
	}
	
}
