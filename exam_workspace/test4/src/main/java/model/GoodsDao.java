package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GoodsDao {
	
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
	
	//상품목록 조회
	public ArrayList<Goods> selectGoods() {
		dbCon();
		ArrayList<Goods> list = new ArrayList<>();
		String sql = "SELECT goods_cd, goods_nm, goods_price, cost, "
				+ "  TO_CHAR(in_date, 'yyyy-mm-dd') "
				+ "FROM goods_tbl_500";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String goods_cd = rs.getString(1);
				String goods_nm = rs.getString(2);
				int goods_price = rs.getInt(3);
				int cost = rs.getInt(4);
				String in_date = rs.getString(5);
				list.add(new Goods(goods_cd, goods_nm, goods_price, cost, in_date));
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
	
	//상품 정보 등록
	public void insertGoods(Goods goods) {
		dbCon();
		String sql = "INSERT INTO goods_tbl_500 VALUES(goods_cd_seq.NEXTVAL,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, goods.getGoods_nm());
			pst.setInt(2, goods.getGoods_price());
			pst.setInt(3, goods.getCost());
			pst.setString(4, goods.getIn_date());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//한개의 상품 정보
	public Goods selectOneGoods(String goods_cd) {
		dbCon();
		Goods goods = new Goods();
		String sql = "SELECT goods_nm, goods_price, cost, TO_CHAR(in_date, 'yyyy-mm-dd') "
				+ "FROM goods_tbl_500 WHERE goods_cd = ? ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, goods_cd);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				String goods_nm = rs.getString(1);
				int goods_price = rs.getInt(2);
				int cost = rs.getInt(3);
				String in_date = rs.getString(4);
				goods = new Goods(goods_cd, goods_nm, goods_price, cost, in_date);
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return goods;
	}
	
	//상품 정보 변경
	public void updateGoods(Goods goods) {
		dbCon();
		String sql = "UPDATE goods_tbl_500 SET goods_nm=?, goods_price=?, cost=? WHERE goods_cd=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, goods.getGoods_nm());
			pst.setInt(2, goods.getGoods_price());
			pst.setInt(3, goods.getCost());
			pst.setString(4, goods.getGoods_cd());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//점포별 매출현황
	public ArrayList<StoreSales> selectStoreSales() {
		dbCon();
		ArrayList<StoreSales> list = new ArrayList<>();
		String sql = "SELECT store_nm, s.store_cd, "
				+ "  NVL(LTRIM (TO_CHAR(SUM(DECODE(pay_type,'01', sale_cnt*goods_price)),'999,999')) ,0)||'원' cash, "
				+ "  NVL(LTRIM(TO_CHAR(SUM(DECODE(pay_type,'02', sale_cnt*goods_price)),'999,999')),0)||'원' card, "
				+ "  LTRIM(TO_CHAR(SUM(sale_cnt*goods_price),'999,999'))||'원' tot "
				+ "FROM sale_tbl_500 s  "
				+ "JOIN goods_tbl_500 g  "
				+ "ON g.goods_cd = s.goods_cd  "
				+ "JOIN store_tbl_500 t  "
				+ "ON t.store_cd = s.store_cd  "
				+ "GROUP BY t.store_nm, s.store_cd "
				+ "ORDER BY tot DESC";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String store_nm = rs.getString(1);
				String store_cd = rs.getString(2);
				String cash_sales = rs.getString(3);
				String card_sales = rs.getString(4);
				String tot_sales = rs.getString(5);
				list.add(new StoreSales(store_nm, store_cd, cash_sales, card_sales, tot_sales));
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
	
	//점포별 매출상세
	public ArrayList<Store> selectStore(String store_cd) {
		dbCon();
		ArrayList<Store> list = new ArrayList<>();
		String sql = "SELECT DECODE(sale_fg, '1','판매', '2','취소'),   "
				+ "  sale_no, TO_CHAR(sale_ymd,'YYYY-MM-DD'), goods_nm, sale_cnt,  "
				+ "  goods_price*sale_cnt,  "
				+ "  DECODE(pay_type, '01','현금', '02','카드') "
				+ "FROM sale_tbl_500 s "
				+ "JOIN goods_tbl_500 g  "
				+ "ON s.goods_cd = g.goods_cd  "
				+ "JOIN store_tbl_500 t  "
				+ "ON s.store_cd = t.store_cd  "
				+ "WHERE s.store_cd = ? AND sale_fg = '1' ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, store_cd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String sale_fg = rs.getString(1);
				String sale_no = rs.getString(2);
				String sale_ymd = rs.getString(3);
				String goods_nm = rs.getString(4);
				int sale_cnt = rs.getInt(5);
				int sales = rs.getInt(6);
				String pay_type = rs.getString(7);
				list.add(new Store(sale_fg, sale_no, sale_ymd, goods_nm, sale_cnt, sales, pay_type));
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
	
	//시퀀스 다음값
	public String selectSeq() {
		dbCon();
		String seqCurr = "";
		String sql = "SELECT goods_cd_seq.NEXTVAL, goods_cd_seq.CURRVAL FROM DUAL";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				seqCurr = rs.getString(1);
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seqCurr;
	}
	
	//시스템날짜
	public String selectSysdate() {
		dbCon();
		String sysdate = "";
		String sql = "SELECT TO_CHAR(sysdate,'yyyy-mm-dd') FROM DUAL";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				sysdate = rs.getString(1);
			}
			
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sysdate;
	}
	
	
	public static void main(String[] args) {
		GoodsDao dao = new GoodsDao();
		dao.dbCon();
		ArrayList<Goods> list = dao.selectGoods();
		ArrayList<StoreSales> list2 = dao.selectStoreSales();
//		for(StoreSales goods : list2) {
//			System.out.println(goods);
//		}
		System.out.println(dao.selectOneGoods("110001"));
	}

}
