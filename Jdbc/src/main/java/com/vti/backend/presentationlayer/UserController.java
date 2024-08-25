package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserServiceImpl;
import com.vti.entity.User;

public class UserController {
	public List<User> getAllListUser() throws SQLException{
		IUserService iUserservice = new UserServiceImpl();
		return iUserservice.getAllListUser();
	}
	public List<User> getUserByName(String username) throws SQLException{
		IUserService iUserservice = new UserServiceImpl();
		return iUserservice.getUserByName(username);
	}
	public boolean insertUser(String username, String password) throws SQLException {
		if(password.length()<=8) {
			System.out.println("Do dai password phai lon hon 8");
			return false;
		}else {
		IUserService iUserservice = new UserServiceImpl();
		return iUserservice.insertUser(username, password);			
		}
	}

}
