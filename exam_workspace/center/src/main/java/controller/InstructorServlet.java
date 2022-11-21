package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.Instructor;

@WebServlet("/instructor-list")
public class InstructorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터
		Dao dao = new Dao();
		ArrayList<Instructor> list = dao.selectInstructors2();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/instructor_list.jsp").forward(request, response);
	}
}
