package model;

import java.util.ArrayList;

public class GoodsService {

	GoodsDAO2 dao;
	
	public GoodsService() {	}
	
	public GoodsService(GoodsDAO2 dao) {
		this.dao = dao;
	}

	
	public void insertGoods(String[] strings) {
		
		dao.insertGoods(strings);
		
	}
	
	public ArrayList<Goods> selectAll() {
		
		ArrayList<Goods> list = dao.goodsList();
		return list;
		
	}
	
	
	public static void main(String[] args) {
		GoodsService gs = new GoodsService(new GoodsDAO2());
		ArrayList<Goods> list = gs.selectAll();
		System.out.println(list.size());
	}
	
	
	
}
