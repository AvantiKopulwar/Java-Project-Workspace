package com.av;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBUtil {
	static Connection getConMysql() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	 // System.out.println(2);
	  Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	return con;
}
	Connection getonOracle() {
		return null;
	}
}
