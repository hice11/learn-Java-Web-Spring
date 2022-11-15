package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Goods;
import model.GoodsDAO2;

@WebServlet("/goods2")
public class GoodsController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//입력 - form
		request.setCharacterEncoding("UTF-8");
		
		String[] strings = new String[4];
		strings[0] = request.getParameter("goods_code");
		strings[1] = request.getParameter("goods_name");
		strings[2] = request.getParameter("kind");
		strings[3] = request.getParameter("goods_price");
		// 콘솔로 테스트
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]+" ");
		}
		
		//처리 - 모델 (데이터베이스)
		GoodsDAO2 dao = new GoodsDAO2();
		dao.insertGoods(strings);  //테이블에 데이터 입력
		ArrayList<Goods> list = dao.goodsList();  //테이블 조회
		for(Goods goods:list) System.out.println(goods);  //데이터 테스트
		
		//view로 출력
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/goodsList.jsp").forward(request, response);
		
	}
}
