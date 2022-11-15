package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajax2")
public class Servlet3 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] goods = {"0001","콜라", "음료", "2000"};	
		StringBuffer buffer = new StringBuffer();
//		buffer.append(goods[0]);
//		buffer.append("-");
//		buffer.append(goods[1]);
//		buffer.append("-");
//		buffer.append(goods[2]);
//		buffer.append("-");
//		buffer.append(goods[3]);
		for (int i = 0; i < goods.length; i++) {
			buffer.append(goods[i]);
			buffer.append("-");
		}	
		
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().print(buffer.toString());
		
	}

	
}


