package pagePrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="1234";
	Connection con = null;
	
	
	 
	public ArrayList<Member> getListPage(int page){

		int pageSize = 2;

		int start= (page-1)*pageSize+1;
		int end = page*pageSize;

		ArrayList<Member> list = new ArrayList<>();
		try {			 

			dbCon();
			String sql="select  m_id, m_pw, m_name, "
					+ "m_tel, m_birthday, m_point, m_grade "
					+ " from "
					+ "	( select rownum num , m_id, m_pw, m_name, m_tel, "
					+ " m_birthday, m_point, m_grade "
					+ " from member_tbl_11 ) "
					+ "	where num between ?  and ? " ;
			PreparedStatement pst  =con.prepareStatement(sql);

			pst.setInt(1, start);
			pst.setInt(2, end);
			ResultSet rs  =pst.executeQuery();

			while( rs.next()) {
				Member m = new Member (rs.getString(1) , rs.getString(2) , rs.getString(3) , rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));
				list.add(m);
			}	

			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {			 
			e.printStackTrace();
		}	 

		return list;		
	}


	public int  getTotal(){		

		int count=0;			 
		try {			 

			dbCon();
			String sql =" select count(*) from member_tbl_11 ";
			PreparedStatement pst  =con.prepareStatement(sql);	

			ResultSet rs  =pst.executeQuery();

			while( rs.next()) {
				count = rs.getInt(1);
			}	

			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {			 
			e.printStackTrace();
		}	 

		return count;		
	}


	private void dbCon() {		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) { System.out.println("db ok");}


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		//dao.dbCon();
		ArrayList<Member> list  =dao.getListPage(2);		

		for( int i=0; i< list.size(); i++) {
			System.out.println(  list.get(i).getM_id());
		}

		int cnt = dao.getTotal();
		System.out.println( cnt);

	} 
}
