package com.av;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class InsertTest {
	public static void main(String[] args) throws Exception {
		  System.out.println(1);
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println(2);
		  Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		  con.setAutoCommit(false);
		  System.out.println(3);
		  Statement stmt = (Statement) con.createStatement();
		  System.out.println(4);
		  String sql= "insert into city values (6,'del1')";
		  String sql1= "insert into student values (6,'Ba1',6)";
          System.out.println(5);
		  int rowUpdated = stmt.executeUpdate(sql);
		  int rowUpdated1 = stmt.executeUpdate(sql1);
		  System.out.println(6);
		  System.out.println(rowUpdated);
		  System.out.println(rowUpdated1);
	      con.commit();
	}
}
