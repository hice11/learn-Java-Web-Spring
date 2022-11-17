package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodsDao;
import model.Store;
import model.StoreSales;

@WebServlet("/store")
public class StoreServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//code
		String store_cd = request.getParameter("code");
		String store_name = request.getParameter("name");
		GoodsDao dao = new GoodsDao();
		ArrayList<Store> list = dao.selectStore(store_cd);
		
		request.setAttribute("list", list);
		request.setAttribute("store_name", store_name);
		request.getRequestDispatcher("WEB-INF/views/store.jsp").forward(request, response);
	}

}
