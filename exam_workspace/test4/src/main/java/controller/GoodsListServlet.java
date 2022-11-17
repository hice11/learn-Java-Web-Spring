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

@WebServlet("/goods-list")
public class GoodsListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsDao dao = new GoodsDao();
		ArrayList<Goods> list = dao.selectGoods();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/goods_list.jsp").forward(request, response);
	}
	
}
