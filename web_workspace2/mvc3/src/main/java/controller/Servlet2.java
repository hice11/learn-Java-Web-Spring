package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxtest")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("m_id");
		System.out.println(id);
		//id => 중복확인 과정 필요 ,  
		//임의로 1 : 중복되어있음, 0 : 중복되지 않음
		int result = 1;
		response.getWriter().print(result);
		
	}

}
