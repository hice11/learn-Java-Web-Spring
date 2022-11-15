package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.Goods;
import model.GoodsDAO2;
import model.GoodsService;

@WebServlet("/goodsJson")
public class GoodsJsonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsService gs = new GoodsService(new GoodsDAO2());
		ArrayList<Goods> list = gs.selectAll();
		
		JSONObject goodsList = new JSONObject();
		
		JSONArray gArray = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject goods = new JSONObject();
			goods.put("code", list.get(i).getGoods_code());
			goods.put("name", list.get(i).getGoods_name());
			goods.put("kind", list.get(i).getKind());
			goods.put("price", list.get(i).getGoods_price());
			gArray.add(goods);
		}
		
		goodsList.put("goodsList", gArray);
		
		System.out.println(goodsList);
		response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/plain;charset=utf-8");
		response.getWriter().print(goodsList);
		
		
	}
	
}
