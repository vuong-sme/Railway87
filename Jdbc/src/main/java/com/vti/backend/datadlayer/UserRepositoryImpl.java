package com.vti.backend.datadlayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.utils.JdbcConnection;

public class UserRepositoryImpl implements IUserRepository {

	public List<User> getAllListUser() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> lstUser = new ArrayList<User>();
		try {
			con = JdbcConnection.getConnection();
			String sql = "select * from users join department on users.departmentid = department.id";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String username = rs.getString("username");
				String password = rs.getString("password");
				int dpId = rs.getInt(5);
				String dpName = rs.getString("departmentName");
				Department dp = new Department(dpId, dpName);
				User us = new User(id, username, password, dp);
				lstUser.add(us);
			}
			return lstUser;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			JdbcConnection.closeConnection(con, ps, rs, null);
		}
	}

	public List<User> getUserByName(String username) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> lstUser = new ArrayList<User>();
		try {
			con = JdbcConnection.getConnection();
			String sql = "select * from users join department on users.departmentId = department.id where username like ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, username + "%");
			rs = ps.executeQuery();
			if (rs.next()) {
				{
					do {
						int id = rs.getInt(1);
						String username1 = rs.getString("username");
						String password = rs.getString("password");
						int dpId = rs.getInt(5);
						String dpName = rs.getString("departmentName");
						Department dp = new Department(dpId, dpName);
						User us = new User(id, username1, password, dp);
						lstUser.add(us);
					} while (rs.next());
					return lstUser;
				}
			} else {
				return null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			JdbcConnection.closeConnection(con, ps, rs, null);
		}
	}

	public boolean insertUser(String username, String password) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JdbcConnection.getConnection();
			con.setAutoCommit(false);
			String sql = "insert into users (username, password) values (?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println("Insert thanh cong!");
				con.commit();
				return true;
			} else {
				System.out.println("Insert khong thanh cong!");
				con.rollback();
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Update khong thanh cong!");
			con.rollback();
			return false;
		} finally {
			JdbcConnection.closeConnection(con, ps, null, null);
		}

	}

	public boolean checkExist(String username) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JdbcConnection.getConnection();
			String sql = "select * from users where username = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JdbcConnection.closeConnection(con, ps, null, null);
		}
	}

}
