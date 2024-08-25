package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datadlayer.IUserRepository;
import com.vti.backend.datadlayer.UserRepositoryImpl;
import com.vti.entity.User;

public class UserServiceImpl implements IUserService{

	public List<User> getAllListUser() throws SQLException {
		IUserRepository iUserRepository = new UserRepositoryImpl();
		return iUserRepository.getAllListUser();
	}

	public List<User> getUserByName(String username) throws SQLException {
		IUserRepository iUserRepository = new UserRepositoryImpl();
		return iUserRepository.getUserByName(username);
	}

	public boolean insertUser(String username, String password) throws SQLException {
		IUserRepository iUserRepository = new UserRepositoryImpl();
		if(iUserRepository.checkExist(username)) {
			System.out.println("Username da ton tai");
			return false;
		}
		return iUserRepository.insertUser(username, password);
	}

}
