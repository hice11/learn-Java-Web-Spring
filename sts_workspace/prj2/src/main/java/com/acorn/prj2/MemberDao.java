package com.acorn.prj2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	@Autowired
	DataSource ds;
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
	}

	public MemberDao(DataSource ds) {
		super();
		this.ds = ds;
	}
	
	public Member select(String id) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Member member = null;
		
		String sql = "SELECT * FROM login WHERE id = ?";
		try {
			conn = ds.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if(rs.next()) {
				String id1 = rs.getString(1);
				String pw = rs.getString(2);
				member = new Member(id1, pw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst, conn);
		}
		return member;
	}
	
	private void close(AutoCloseable ...autoCloseables) {
		for(AutoCloseable a : autoCloseables) {
				try {
					if(a!=null) a.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	

}
