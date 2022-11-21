package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Course;
import model.Dao;

@WebServlet("/reg-course")
public class RegCourseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		int code = dao.selectCourseCode() + 1;
		
		request.setAttribute("code", code);
		request.getRequestDispatcher("WEB-INF/views/reg_course.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//form
		request.setCharacterEncoding("UTF-8");
		String co_code = request.getParameter("co_code");
		String co_name = request.getParameter("co_name");
		String br_code = request.getParameter("br_code");
		String inst_code = request.getParameter("inst_code");
		String price = request.getParameter("price");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");
		//
		Dao dao = new Dao();
		dao.insertCourseInfo(new Course(co_code, co_name, br_code, inst_code, price, start_date, end_date));
		//
		response.sendRedirect("/center/branch-list");
		
	}
}
