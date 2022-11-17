package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goods-update")
public class GoodsUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//code 받기
		request.setCharacterEncoding("UTF-8");
		String goods_cd = request.getParameter("code");
		request.getRequestDispatcher("WEB-INF/views/goods_update.jsp").forward(request, response);
	}
	
}
