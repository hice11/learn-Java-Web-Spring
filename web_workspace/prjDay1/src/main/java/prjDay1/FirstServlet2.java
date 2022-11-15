package prjDay1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//url 맵핑 반드시 있어야함
@WebServlet("/hi2.do")
public class FirstServlet2 extends HttpServlet{

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//출력
		PrintWriter out = response.getWriter();
		out.println("hello FirstServlet2!");
		
	}
	
}
