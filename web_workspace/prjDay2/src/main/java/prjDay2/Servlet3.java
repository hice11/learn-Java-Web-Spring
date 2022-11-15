package prjDay2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s31012")
public class Servlet3   extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//service가 기본으로 해주는 작업
		 String method= req.getMethod();
		 System.out.println( method);
		 if(method.equals("GET")) {
			 doGet( req, resp);
		 }else {
			 doPost( req, resp);
		 }
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("get매서드 호출");
		 		
	}
	
	
}

