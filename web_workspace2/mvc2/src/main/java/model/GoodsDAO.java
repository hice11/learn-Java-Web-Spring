package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDAO {
	
	public GoodsDAO() {	}

	//DB 연결
	public Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			//연결 테스트
			if(con != null) System.out.println("\nConnection ok");
			else System.out.println("\nConnection fail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}//
	
	//테이블에 데이터 입력
	public void insertGoodsData(String[] strings, Connection con) {
		String sql = "INSERT INTO goods_list VALUES(?,?,?,?,null)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			for (int i = 0; i < strings.length; i++) {
				pst.setString(i+1, strings[i]);
			}
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//
	
	//DB 테이블 받아오기
	public ArrayList<Goods> getGoodsList(Connection con) {
		String sql = "SELECT goods_code, goods_name, kind, goods_price FROM goods_list";
		ArrayList<Goods> list = new ArrayList<>();
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}//
	
	
	public static void main(String[] args) {
		
		
	}
	
}
