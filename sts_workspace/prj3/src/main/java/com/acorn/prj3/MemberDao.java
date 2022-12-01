package com.acorn.prj3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	@Autowired
	DataSource dataSource;
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
	}
	
	//데이터 등록
	public void insertMember(Member2 member) {
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "INSERT INTO member_tbl_1201 VALUES(?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, member.getId());
			pst.setString(2, member.getName());
			pst.setString(3, member.getAddr());
			pst.setString(4, member.getSns());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst, conn);
		}
	}
	
	//데이터 조회
	public ArrayList<Member2> selectMember() {
		ArrayList<Member2> list = new ArrayList<Member2>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl_1201";
		try {
			conn = dataSource.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				String sns = rs.getString(4);
				list.add(new Member2(id, name, addr, sns));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst, conn);
		}
		
		return list;
	}
	
	//데이터 조회 배열로
	public ArrayList<Member> selectMember2() {
		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl_1201";
		try {
			conn = dataSource.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				String[] sns = rs.getString(4).split(",");
				list.add(new Member(id, name, addr, sns));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst, conn);
		}
		
		return list;
	}
	
	private void close(AutoCloseable...autoCloseables) {
		for(AutoCloseable a : autoCloseables) {
			try {
				if(a!=null) a.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
