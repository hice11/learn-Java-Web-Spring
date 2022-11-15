package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Member;
import model.TestDBDAO;

@WebServlet("/db3")
public class DBServlet3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TestDBDAO testDBDAO = new TestDBDAO();
		ArrayList<Member> list = testDBDAO.members();
		

		//view를 거쳐서 출력
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
		
	}//
	
	

}
