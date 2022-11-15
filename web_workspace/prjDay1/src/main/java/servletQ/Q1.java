package servletQ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q1.ch")
public class Q1 extends HttpServlet {

	//두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		response.setCharacterEncoding("UTF-8");  //보낼 떄   
		response.setContentType("text/html;charset=utf-8");  // 브라우저에게 해석할 떄
		
		//입력
		int su1, su2;
		String su1_ =request.getParameter("su1");
		su1 = Integer.parseInt(su1_);
		String su2_ =request.getParameter("su2");
		su2 = Integer.parseInt(su2_);
		//처리
		int add = su1 + su2;
		int sub = su1 - su2;
		int mul = su1 * su2;
		double div = (double)su1 / su2;
		//출력
		PrintWriter out = response.getWriter();
		
		/*
		out.println(su1 +" + "+su2+" = "+add);
		out.println(su1 +" - "+su2+" = "+sub);
		out.println(su1 +" x "+su2+" = "+mul);
		out.println(su1 +" / "+su2+" = "+div);
		*/
		
		out.write("");
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>"); 
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>"); 
		out.write("<Style>");
		out.write("body{"); 
		out.write(" margin:0 auto;");
		out.write(" background-color: black;"); 
		out.write("}");
		out.write("div{"); 
		out.write(" width:200px;"); 
		out.write(" height:220px;");
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
		out.write("su1 = "+su1+"<br>su2 = "+su2+"<br><br>");
		out.write(su1 +" + "+su2+" = "+add+"<br>");
		out.write(su1 +" - "+su2+" = "+sub+"<br>");
		out.write(su1 +" x "+su2+" = "+mul+"<br>");
		out.write(su1 +" / "+su2+" = "+div+"<br>");
		out.write("</div>"); 
		out.write("</body>"); 
		out.write("</html>");
		
	}
	
	
	
}
