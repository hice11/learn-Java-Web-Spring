package prjDay1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi3")
public class Servlet1 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		String userId = request.getParameter("userId");
		System.out.println(userId);
		//처리
		String result = userId + "hello";
		//출력
		PrintWriter out = response.getWriter();
		out.print(result);
		
	}
	
	
	
}
