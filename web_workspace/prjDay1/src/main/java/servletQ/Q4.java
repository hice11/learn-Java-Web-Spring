package servletQ;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q4.ch")
public class Q4 extends HttpServlet {

	//자신이 처리하고 싶은 자료에 대한 class를 만들고 그 정보를 제공하기 (응답해 주기)
	//예) 책정보:Book class
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//처리
		Movie movie = new Movie("테넷", "크리스토퍼 놀란", 150, "액션, SF");
		Movie movie2 = new Movie("정직한 후보2", "장유정", 107, "코미디");
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
		out.write(" width:500px;"); 
		out.write(" height:200px;");
		out.write(" color:white;"); 
		out.write(" font-size:20px;"); 
		out.write(" font-width:bold;");
		out.write(" vertical-align: middle;");
		out.write(" padding:10px 5px;");
		out.write(" margin:10px auto;");
		out.write(" text-align:center;");
		out.write(" border: 1px solid white;");
		out.write("}"); 
		out.write("h3{"); 
		out.write(" background-color: black;"); 
		out.write(" margin:10px auto;");
		out.write("}");
		out.write("span{"); 
		out.write(" border: 1px solid white;");
		out.write(" display: inline-block;");
		out.write(" width:220px;"); 
		out.write(" height:120px;");
		out.write(" line-height:30px;");
		out.write(" text-align:left;");
		out.write(" margin:3px;");
		out.write(" padding:10px;");
		out.write("}");
		out.write("</Style>");
		out.write("</head>"); 
		out.write("<body>");
		out.write("<div>");
		out.write("<h3> Movie Info </h3>");
		out.write("<span>");
		out.write(movie+"");
		out.write("</span>");
		out.write("<span>");
		out.write(movie2+"");
		out.write("</span>");
		out.write("</div>"); 
		out.write("</body>"); 
		out.write("</html>");
		
		
	}

}
