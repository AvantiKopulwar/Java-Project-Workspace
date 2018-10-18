package com.av;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pstmt {
public static void main(String[] args) throws Exception {
	Connection con = DBUtil.getConMysql();
	  String sql= "insert into city values (5,'Mumbai')";
	PreparedStatement pstmt= con.prepareStatement(sql);
	pstmt.executeUpdate();
}
}
