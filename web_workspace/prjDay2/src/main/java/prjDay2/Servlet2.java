package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv2.ch")
public class Servlet2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//인코딩, html
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		//입력
		int n = 5;
		String n_ = request.getParameter("n");
		if(n_ != null) n = Integer.parseInt(n_);
		//처리
		// 랜덤 1~20
		int ran = (int)(Math.random()*20+1);
		String star="";
		for (int i = 0; i < n; i++) {
			star += "★";
		}
		
		//출력
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("body{"); 
		out.println(" background-color: black;"); 
		out.println(" margin:0 auto;");
		out.println("}");
		out.println("div{"); 
		out.println(" width:300px;"); 
		out.println(" border: 1px solid lightyellow;");
		out.println(" color:lightyellow;"); 
		out.println(" border: 1px solid lightyellow;"); 
		out.println(" border-radius: 3px;"); 
		out.println(" font-size:20px;"); 
		out.println(" font-width:bold;");
		out.println(" text-align:center;");
		out.println(" vertical-align: middle;");
		out.println(" padding:10px 5px;");
		out.println(" margin:30px auto;");
		out.println("}"); 
		out.println("h4{"); 
		out.println(" margin:10px auto;");
		out.println(" color:white;"); 
		out.println("}");
		out.println("button{"); 
		out.println(" cursor: pointer;"); 
		out.println(" margin:10px auto;");
		out.println(" color:lightyellow;"); 
		out.println(" background-color: darkblue;"); 
		out.println(" border: 1px solid lightyellow;"); 
		out.println(" border-radius: 3px;"); 
		out.println(" width: 30px;"); 
		out.println(" height: 30px;"); 
		out.println("}");
		out.println("span{"); 
		out.println(" color:yellow;"); 
		out.println(" font-size:40px;"); 
		out.println(" line-height: 60px;");
		out.println(" word-break:break-all;");
		out.println("}");
		out.println("</Style>");
		out.println("</head>"); 
		out.println("<body>");
		out.println("<div>");
		out.println("<h4>");
		out.println("<a href=\"http://localhost:8080/prjDay2/serv2.ch?n="+ran+"\"><button>별</button></a>");
		out.println("Click </h4>");
		out.println("<span>"+ star +"</span>");
		out.println("</div>"); 
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
