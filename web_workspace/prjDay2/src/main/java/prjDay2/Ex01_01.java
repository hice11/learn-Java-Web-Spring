package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex0101")
public class Ex01_01  extends HttpServlet{
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			 request.setCharacterEncoding("UTF-8");
			 response.setCharacterEncoding("utf-8");
			 response.setContentType("text/html;charset=utf-8");
			
			 System.out.println("start");		 
			 
			
			//입력
			 String su1_ = request.getParameter("su1");   // getParameter("su1")  => su1은 key이름
			 String su2_ = request.getParameter("su2");
			 String op = request.getParameter("op");   // ?su1=3&su2=10&op=+
			 // +  -  *  /
			 
			 System.out.println(  su1_);
			 System.out.println(  su2_);
			 System.out.println(  op);
			 
			 int su1=0;
			 int su2=0;
			 
			 if( su1_ != null && su2_ != null  &&  op != null) {
				   su1 =  Integer.parseInt(su1_);  
				   su2 =  Integer.parseInt(su2_); 
			 }
			 // su1_ =null;
			 // su2_= null		 			
			 
			//처리				 
			
			int result=0;			
			switch(op) {
				case "add":
					 result  = su1+su2;
					 break;
				case  "minus":
					result = su1-su2;
					break;
				case "divide":
					result = su1 / su2;
					break;
				default :
					result=0;				
			}			
			 
			//출력
			System.out.println( result);
			PrintWriter out  =response.getWriter();			
			out.println(result);			
			
		}
}
