package com.av;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConn {

	public static void main(String[] args) {
		Statement stm = null;
		try {
			Connection con = DBUtil.getConMysql();
			stm = con.createStatement();
			String sql="delete from staff  where id = 4";
			stm.executeUpdate(sql);
			sql="select id, firstName,lastName,age from staff";
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("firstName");
				String last = rs.getString("lastName");
				System.out.println("ID is :"+id+"\n");
				System.out.println("First Name is :"+first+"\n");
				System.out.println("Last Name is :"+last+"\n");
				System.out.println("Age is :"+age+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
