package com.aktrix.dms.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDataBase {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "dms";
	private static final String password = "dms";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
