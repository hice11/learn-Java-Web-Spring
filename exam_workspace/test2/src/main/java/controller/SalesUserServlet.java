package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.SalesUser;

@WebServlet("/sales2")
public class SalesUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<SalesUser> list = dao.selectSalesUser();
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/sales_user.jsp").forward(request, response);

	}

}
