package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDAO2 {

	//DB작업
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;
	
	//DB연결
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			//연결 테스트
			if(con != null) System.out.println("\nConnection ok");
			else System.out.println("\nConnection fail");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//
	
	//테이블에 상품 등록
	public void insertGoods(String[] strings) {
		//디비 연결
		dbCon();
		String sql = "INSERT INTO goods_list VALUES(?,?,?,?,null)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			for (int i = 0; i < strings.length; i++) {
				pst.setString(i+1, strings[i]);
			}
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//전체 상품 조회
	public ArrayList<Goods> goodsList() {
		//배열
		ArrayList<Goods> list = new ArrayList<>();
		//디비 연결
		dbCon();
		String sql = "SELECT goods_code, goods_name, kind, goods_price FROM goods_list";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String goods_code = rs.getString(1);
				String goods_name = rs.getString(2);
				String kind = rs.getString(3);
				String goods_price = rs.getString(4);
				list.add(new Goods(goods_code, goods_name, kind, goods_price));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}//
	
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
}
