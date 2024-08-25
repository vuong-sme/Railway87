package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConnection {
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		Properties pr = new Properties();
		pr.load(new FileInputStream("src/main/resource/database.properties"));
		String url = pr.getProperty("url");
		String user = pr.getProperty("user");
		String password = pr.getProperty("password");
		Connection con = DriverManager.getConnection(url, user, password);
		if(con!=null) {
			System.out.println("Connection OK");
		}else {
			System.out.println("Connection fail");
		}
		return con;
	}
	
	public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs, Statement st) throws SQLException {
		if(con!=null && !con.isClosed()) {
			con.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(rs!=null) {
			rs.close();
		}
		if(st!=null) {
			rs.close();
		}
	}

}
