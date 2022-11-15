package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BuyInfo;
import model.Dao;
import model.SalesProd;

@WebServlet("/reg-buy")
public class RegBuyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("reg_buy.html").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//form 데이터
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String prodname = request.getParameter("prodname");
		String groupname = request.getParameter("groupname");
		String price_ = request.getParameter("price");
		int price = Integer.parseInt(price_);
		String amount_ = request.getParameter("amount");
		int amount = Integer.parseInt(amount_);
		//데이터 등록
		Dao dao = new Dao();
		dao.insertBuyInfo(new BuyInfo(userid, prodname, groupname, price, amount));
		
		//전체 조회로
		response.sendRedirect("/test2/sales1");
		
	}

}
