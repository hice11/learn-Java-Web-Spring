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
	
	//매출현황 전체 조회
	public ArrayList<SalesTotal> selectSalesTotal() {
		dbCon();
		ArrayList<SalesTotal> list = new ArrayList<>();
		String sql = "SELECT b.num, u.userid, u.name, b.prodname, b.groupname, b.price, b.amount, b.price*b.amount sales "
				+ "FROM user_tbl_020 u "
				+ "JOIN buy_tbl_020 b "
				+ "ON u.userid = b.userid";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int num = rs.getInt(1);
				String userid = rs.getString(2);
				String name = rs.getString(3);
				String prodname = rs.getString(4);
				String groupname = rs.getString(5);
				int price = rs.getInt(6);
				int amount = rs.getInt(7);
				int sales = rs.getInt(8);
				list.add(new SalesTotal(num, userid, name, prodname, groupname, price, amount, sales));
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
	
	//매출현황 회원 조회
	public ArrayList<SalesUser> selectSalesUser() {
		dbCon();
		ArrayList<SalesUser> list = new ArrayList<>();
		String sql = "SELECT u.userid, u.name, u.addr, SUBSTR(u.birthday,3,2), SUM(b.price*b.amount) tot  "
				+ "FROM user_tbl_020 u "
				+ "JOIN buy_tbl_020 b "
				+ "ON u.userid = b.userid "
				+ "GROUP BY u.userid, u.name, u.addr, SUBSTR(u.birthday,3,2) "
				+ "ORDER BY tot DESC";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String userid = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				int birthday = rs.getInt(4);
				int sales = rs.getInt(5);
				list.add(new SalesUser(userid, name, addr, birthday, sales));
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
	
	//매출현황 믈품 조회
	public ArrayList<SalesProd> selectSalesProd() {
		dbCon();
		ArrayList<SalesProd> list = new ArrayList<>();
		String sql = "SELECT prodname, groupname, tot, RANK()OVER(ORDER BY tot DESC) "
				+ "FROM prod_emp";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String prodname = rs.getString(1);
				String groupname = rs.getString(2);
				int sales = rs.getInt(3);
				int rank = rs.getInt(4);
				list.add(new SalesProd(prodname, groupname, sales, rank));
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
	
	//구매정보 등록
	public void insertBuyInfo(BuyInfo buyInfo) {
		dbCon();
		String sql = "INSERT INTO buy_tbl_020 VALUES(seq_buy_num.NEXTVAL,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, buyInfo.getUserid());
			pst.setString(2, buyInfo.getProdname());
			pst.setString(3, buyInfo.getGroupname());
			pst.setInt(4, buyInfo.getPrice());
			pst.setInt(5, buyInfo.getAmount());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		Dao dao = new Dao();
		dao.dbCon();
		ArrayList<SalesTotal> list = dao.selectSalesTotal();
		ArrayList<SalesUser> list2 = dao.selectSalesUser();
		ArrayList<SalesProd> list3 = dao.selectSalesProd();
		System.out.println(list3.size());
		for(SalesProd sales : list3) {
			System.out.println(sales);
		}
	}


}
