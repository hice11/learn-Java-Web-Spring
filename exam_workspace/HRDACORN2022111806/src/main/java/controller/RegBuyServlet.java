package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Buy;
import model.Dao;

@WebServlet("/reg-buy")
public class RegBuyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("WEB-INF/views/reg_buy.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//form
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String prodname = request.getParameter("prodname");
		String groupname = request.getParameter("groupname");
		String price = request.getParameter("price");
		String amount = request.getParameter("amount");
		//
		Dao dao = new Dao();
		dao.insertBuyInfo(new Buy(userid, prodname, groupname, price, amount));
		
		//
		response.sendRedirect("/HRDACORN2022111806/tot-sales");
		
	}
}
