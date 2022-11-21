package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CourseList;
import model.Dao;

@WebServlet("/course-list")
public class CourseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터
		String name = request.getParameter("name");
		String code = request.getParameter("code");
		Dao dao = new Dao();
		ArrayList<CourseList> list = dao.selectCourseLists(code);
		
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.getRequestDispatcher("WEB-INF/views/course_list.jsp").forward(request, response);
	}
}
