package com.acorn.prj5.transaction;

import java.sql.SQLException;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import jdk.jfr.Threshold;


@Component
public class TestService {
	
	 @Autowired
	 Dao dao;
	 @Autowired
	 DataSource ds;
 
 
 
	 //transaction 사용
	  public void insertdb1WithTx(String id, String pw)  {
	        PlatformTransactionManager tm = new DataSourceTransactionManager(ds);	       
	        TransactionStatus status = tm.getTransaction(  new DefaultTransactionDefinition()  );	      
	        try {
	        	  dao.insertUser(id, pw);
	    		  dao.insertUser(id, pw);	    		  
	              tm.commit(status);
	        } catch (Exception e) {
	            e.printStackTrace();
	            tm.rollback(status);	            
	        }  
	    }
	  
	  
	  //
	  public void insertdb1(String id, String pw)  {	      
	        	  try {
				  	 dao.insertUser(id, pw);
					 dao.insertUser(id, pw);	   

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	    }
	  

}
