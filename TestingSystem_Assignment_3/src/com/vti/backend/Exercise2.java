package com.vti.backend;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		Account[] account = new Account[4];
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Khởi tạo Account %s: %n",i);
			createAccount(account[i - 1]);
		}
	}

	public static void createAccount(Account acc) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập email: ");
		acc.email = scan.nextLine();
		System.out.println("Nhập tên đăng nhập: ");
		acc.userName = scan.nextLine();
		Locale locate = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locate);
		acc.createdDate = dateFormat.format(new Date());
		scan.close();
	}
}
