package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.ProdSales;

@WebServlet("/prod-sales")
public class ProdSalesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<ProdSales> list = dao.selectprodSales();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/prod_sales.jsp").forward(request, response);
	}
}
