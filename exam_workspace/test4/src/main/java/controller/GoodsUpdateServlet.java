package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Goods;
import model.GoodsDao;

@WebServlet("/goods-update")
public class GoodsUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//code 받기
		request.setCharacterEncoding("UTF-8");
		String goods_cd = request.getParameter("code");
		GoodsDao dao = new GoodsDao();
		Goods goods = dao.selectOneGoods(goods_cd);
		
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("WEB-INF/views/goods_update.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form 데이터
		request.setCharacterEncoding("UTF-8");
		String goods_cd = request.getParameter("goods_cd");
		String goods_nm = request.getParameter("goods_nm");
		String goods_price_ = request.getParameter("goods_price");
		int goods_price = Integer.parseInt(goods_price_);
		String cost_ = request.getParameter("cost");
		int cost = Integer.parseInt(cost_);
		String in_date = request.getParameter("in_date");
		Goods goods = new Goods(goods_cd, goods_nm, goods_price, cost, in_date);
		//등록
		GoodsDao dao = new GoodsDao();
		dao.updateGoods(goods);
		//리스트로 이동
		response.sendRedirect("/test4/goods-list");
	}
	
}
