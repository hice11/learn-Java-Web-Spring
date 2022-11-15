package prjDay3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  로그인
@WebServlet("/s110113")
public class Servlet1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		String id = request.getParameter("id");
		
		System.out.println("call");
		
		//출력
		// 회원정보 확인하는 작업 (예상)
		//  회원인 경우
		PrintWriter out = response.getWriter();
		out.println(id+" hi~");
		
		//  회원이 아닌 경우
		
		
	}
	
	
}
