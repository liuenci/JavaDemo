package com.imooc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://localhost/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "JavaL0318.";
	private static Connection conn = null;
	static{
		try {
			//1.������������
			Class.forName("com.mysql.jdbc.Driver");
			//2.������ݿ������
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return conn;
	}
	public static void main(String[] args) throws Exception {
		//1.������������
		Class.forName("com.mysql.jdbc.Driver");
		//2.������ݿ������
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ�
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		while(rs.next()){
			System.out.println(rs.getString("user_name")+"\t"+rs.getString("age"));
		}
	}
}
