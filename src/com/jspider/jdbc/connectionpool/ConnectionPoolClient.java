package com.jspider.jdbc.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.inject.Inject;

public class ConnectionPoolClient {
	
	@Inject
	static private ConnectionPoolManager pool;

	public static void main(String[] args) {
		Connection con1 = null;
		Connection con2 = null;
		Connection con3 = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			con1 = pool.getConnectionFromPool();
			stmt = con1.createStatement();
			rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println("fname:" + rs.getString("fname") + "lname:" + rs.getString("lname") + "usn:"
						+ rs.getString("usn"));
			}
			con2 = pool.getConnectionFromPool();
			con3 = pool.getConnectionFromPool();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				System.out.println("return the first connection to pool");
				pool.returnConnectionToPool(con1);
				System.out.println("return the second connection to pool");
				pool.returnConnectionToPool(con2);
				System.out.println("return the third connection to pool");
				pool.returnConnectionToPool(con3);
				if (stmt != null) {
					stmt.close();

				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
