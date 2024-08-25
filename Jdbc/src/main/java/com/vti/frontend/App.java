package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.JdbcConnection;
import com.vti.utils.ScannerUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, SQLException, IOException {
		UserController userControllser = new UserController();
		while (true) {
			int i = sellectMenu();
			switch (i) {
			case 1:
				System.out.println("Nhap username:");
				String username = ScannerUtils.inputString("Khong duoc de trang");
				System.out.println("Nhap password:");
				String password = ScannerUtils.inputString("Khong duoc de trang");
				boolean flag = userControllser.insertUser(username, password);
				if (flag) {
					System.out.println("Them moi thanh cong");
				} else {
					System.out.println("Them moi that bai");
				}
				break;
			case 2:
				List<User> lstUser = new ArrayList<User>();
				System.out.println("Nhap ten user can xem:");
				String username1 = ScannerUtils.inputString("Khong duoc de trang");
				lstUser = userControllser.getUserByName(username1);
				if (lstUser != null) {
					System.out.println("Danh sach user: ");
					for (User user : lstUser) {
						System.out.println(user.getUsername());
					}
				} else {
					System.out.println("User khong ton tai!");
				}
				break;
			case 3:
				List<User> lstUser1 = new ArrayList<User>();
				lstUser1 = userControllser.getAllListUser();
				System.out.println("Danh sach user: ");
				for (User user : lstUser1) {
					System.out.println(user.getUsername());
				}
				break;
			case 4:
				return;
			}
		}

	}

	public static int sellectMenu() {
		int i = 0;
		System.out.println("======================================================================");
		System.out.println("Nhap lua chon:");
		System.out.println(" 1.them moi user\n 2.xem user theo ten\n 3.xem danh sach user\n 4.Exit");
		i = ScannerUtils.inputInt();
		while (i != 1 && i != 2 && i != 3 && i != 4) {
			System.out.println("Nhap khong dung, xin moi nhap lai");
			i = ScannerUtils.inputInt();
		}
		return i;
	}
}
