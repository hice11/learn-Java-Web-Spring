package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.UserSales;

@WebServlet("/user-sales")
public class UserSalesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<UserSales> list = dao.selectuserSales();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/user_sales.jsp").forward(request, response);
	}
}
