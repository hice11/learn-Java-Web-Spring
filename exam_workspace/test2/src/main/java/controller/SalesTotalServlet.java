package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.SalesTotal;

@WebServlet("/sales1")
public class SalesTotalServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<SalesTotal> list = dao.selectSalesTotal();
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/sales_total.jsp").forward(request, response);
		
	}

}
