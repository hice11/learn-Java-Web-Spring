package com.acorn.prj5.transaction;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
 


@Component
public class Dao {
    @Autowired
    DataSource ds;
   
    final int FAIL = 0;  
    public int insertUser(String id, String pw) throws SQLException  {
        int rowCnt = FAIL;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into db1 values (?,?) ";
        try {        
        	//주의 !!!  , 같은  connection을 얻어오기 위함   	
        	conn= DataSourceUtils.getConnection(ds);     
        	
        	System.out.println( conn);
            pstmt = conn.prepareStatement(sql); 
            pstmt.setString(1, id );
            pstmt.setString(2, pw);           
            return pstmt.executeUpdate();  
        } catch (SQLException e) {
            e.printStackTrace();
            
            // 주의 !!!!
            // 예외 발생시킴 메소드 호출하는곳에서 예외 처리
            throw e;  
            
        } finally {            
        	close(pstmt);
        	
        	// 주의 !!!
        	// 데이터소스로 연결할때는 close로 반납하지 않는다
        	DataSourceUtils.releaseConnection(conn, ds);   
        }
    }
 

    private void close(AutoCloseable... acs) {
        for(AutoCloseable ac :acs)
            try { if(ac!=null) ac.close(); } catch(Exception e) { e.printStackTrace(); }
    }
    
    
    
}