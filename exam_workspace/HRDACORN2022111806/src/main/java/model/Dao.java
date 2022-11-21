package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;
	
	public void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) System.out.println("db ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//구매정보 등록
	public void insertBuyInfo(Buy buy) {
		dbCon();
		String sql = "INSERT INTO buy_tbl_020 VALUES(buynum_seq.NEXTVAL,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, buy.getUserid());
			pst.setString(2, buy.getProdname());
			pst.setString(3, buy.getGroupname());
			pst.setString(4, buy.getPrice());
			pst.setString(5, buy.getAmount());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//점포별 매출현황 전체
	public ArrayList<TotalSales> selectTotalSales() {
		dbCon();
		ArrayList<TotalSales> list = new ArrayList<>();
		String sql = "SELECT num, b.userid, name, prodname, groupname, price, amount, (price*amount) tot "
				+ "FROM buy_tbl_020 b "
				+ "JOIN user_tbl_020 u "
				+ "ON b.userid = u.userid";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String num = rs.getString(1);
				String userid = rs.getString(2);
				String name = rs.getString(3);
				String prodname = rs.getString(4);
				String groupname = rs.getString(5);
				String price = rs.getString(6);
				String amount = rs.getString(7);
				String sales = rs.getString(8);
				list.add(new TotalSales(num, userid, name, prodname, groupname, price, amount, sales));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//점포별 매출현황 회원
	public ArrayList<UserSales> selectuserSales() {
		dbCon();
		ArrayList<UserSales> list = new ArrayList<>();
		String sql = "SELECT b.userid, name, addr, SUBSTR(birthday,3,2), SUM(price*amount) tot "
				+ "FROM buy_tbl_020 b "
				+ "JOIN user_tbl_020 u "
				+ "ON b.userid = u.userid "
				+ "GROUP BY b.userid, name, addr, SUBSTR(birthday,3,2) "
				+ "ORDER BY tot DESC";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String userid = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				String birthday = rs.getString(4);
				String totSales = rs.getString(5);
				list.add(new UserSales(userid, name, addr, birthday, totSales));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//점포별 매출현황 물품
	public ArrayList<ProdSales> selectprodSales() {
		dbCon();
		ArrayList<ProdSales> list = new ArrayList<>();
		String sql = "SELECT prodname, groupname, SUM(price*amount) tot, "
				+ "  RANK() OVER(ORDER BY SUM(price*amount) DESC ) "
				+ "FROM buy_tbl_020 b "
				+ "JOIN user_tbl_020 u "
				+ "ON b.userid = u.userid "
				+ "GROUP BY prodname, groupname ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String prodname = rs.getString(1);
				String groupname = rs.getString(2);
				String totSales = rs.getString(3);
				String rank = rs.getString(4);
				list.add(new ProdSales(prodname, groupname, totSales, rank));
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		Dao dao = new Dao();
		dao.dbCon();
		ArrayList<TotalSales> list = dao.selectTotalSales();
		for(TotalSales total : list) {
			System.out.println(total);
		}
		
	}

}
