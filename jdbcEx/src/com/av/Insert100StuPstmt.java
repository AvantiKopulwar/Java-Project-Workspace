package com.av;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert100StuPstmt {
public static void main(String[] args) throws Exception {
	Connection con =DBUtil.getConMysql();
	for(int i=100;i<200;i++) {
		String sql= "insert into city values ("+i+",'Mumbai"+i+"')";
	    PreparedStatement pstmt= con.prepareStatement(sql);
		System.out.println(sql);
		  int rowUpdated = pstmt.executeUpdate(sql);
		  System.out.println(rowUpdated);
}
}
}
