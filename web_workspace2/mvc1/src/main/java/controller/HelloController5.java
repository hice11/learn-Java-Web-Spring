package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HelloService;

@WebServlet("/h5")
public class HelloController5 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 입력
		
		
		//처리
		// model - 데이터
		HelloService service = new HelloService();
		String[] result = service.getMessages();
		
		//출력
		// view 거쳐서 응답
		request.setAttribute("result", result);
		request.getRequestDispatcher("WEB-INF/view/helloView.jsp").forward(request, response);
		
	}
	
}
