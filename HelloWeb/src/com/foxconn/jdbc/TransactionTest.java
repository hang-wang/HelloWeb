package com.foxconn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "123456");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

	public static void insertUserData(Connection conn) throws SQLException {

		String sql = "INSERT  INTO tbl_user(id,name,password,email)\r\n" + "VALUES(10,'tom','123456','tom@email')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向用户表中插入了 " + count + " 条记录");

	}

	public static void insertAddressData(Connection conn) throws SQLException {

		String sql = "INSERT  INTO tbl_address(id,city,country,user_id)\r\n" + "VALUES(1,'beijing','china',10)";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向地址表中插入了 " + count + " 条记录");

	}

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);

			insertUserData(conn);
			insertAddressData(conn);
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("捕获异常");
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("回滚成功");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
