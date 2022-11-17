package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Goods;
import model.GoodsDao;
import model.StoreSales;

@WebServlet("/store-sales")
public class StoreSalesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsDao dao = new GoodsDao();
		ArrayList<StoreSales> list = dao.selectStoreSales();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/store_sales.jsp").forward(request, response);
	}

}
