package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Branch;
import model.Dao;

@WebServlet("/branch-list")
public class BranchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<Branch> list = dao.selectBranchs();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/branch_list.jsp").forward(request, response);
	}
}
