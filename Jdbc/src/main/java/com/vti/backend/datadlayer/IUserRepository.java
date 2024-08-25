package com.vti.backend.datadlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {
	public abstract List<User> getAllListUser() throws SQLException;
	public abstract List<User> getUserByName(String username) throws SQLException;
	public abstract boolean insertUser(String username, String password) throws SQLException;
	public abstract boolean checkExist(String username) throws SQLException;

}
