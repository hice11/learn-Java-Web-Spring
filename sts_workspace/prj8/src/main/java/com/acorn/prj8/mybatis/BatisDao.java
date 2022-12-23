package com.acorn.prj8.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BatisDao {

	@Autowired
    private SqlSession session;
    private static String namespace = "com.acorn.woo.MemberMapper.";
        
    public int count() throws Exception {
        return session.selectOne(namespace+"count");
    }  
   

}
