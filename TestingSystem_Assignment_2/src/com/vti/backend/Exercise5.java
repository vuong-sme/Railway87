package com.vti.backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String args[]) throws ParseException {
		// Exercise5/Question1---------------------------
		question1();
		// Exercise5/Question2---------------------------
		question2();
		// Exercise5/Question3---------------------------
		question3();
		// Exercise5/Question4---------------------------
		question4();
		// Exercise5/Question5---------------------------
		User user1 = new User();
		question5(user1);
		// Exercise5/Question6---------------------------
		Department department1 = new Department();
		question6(department1);
		// Exercise5/Question7---------------------------
		question7();
		// Exercise5/Question7---------------------------
		question8();
	}

	public static void question1() {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		System.out.println("Nhap vao 3 so nguyen:");
		for (int i = 1; i <= 3; i++) {
			System.out.printf("So nguyen %s: %n", i);
			a[i - 1] = scan.nextInt();
		}
	}

	public static void question2() {
		Scanner scan = new Scanner(System.in);
		float[] b = new float[2];
		System.out.println("Nhap vao 2 so thuc:");
		for (int i = 1; i <= 2; i++) {
			System.out.printf("So thuc %s: %n", i);
			b[i - 1] = scan.nextFloat();
		}
	}

	public static void question3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		String name = scan.nextLine();
	}

	public static void question4() throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ngay thang nam sinh theo dinh dang dd/mm/yyy: ");
		String dt = scan.nextLine();
		String pattern = "dd/mm/yy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(dt);
	}

	public static void question5(User user) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tao account");
		System.out.println("Nhap id cua account:");
		user.id = scan.nextInt();
		System.out.println("Nhap ten account:");
		user.userName = scan.nextLine();
		System.out.println("Nhap department id bang cac so tu 1 den 4:");
		user.department.id = scan.nextInt();
		switch (user.department.id) {
		case 1:
			user.department.departmentName = "Dev";
			break;
		case 2:
			user.department.departmentName = "Test";
			break;
		case 3:
			user.department.departmentName = "ScrumMaster";
			break;
		case 4:
			user.department.departmentName = "PM";
			break;
		default:
			System.out.println("id phong ban khong ton tai!");
		}

	}

	public static void question6(Department department) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tao department");
		System.out.println("Nhap Department ID: ");
		department.id = scan.nextInt();
		System.out.println("Nhap ten phong ban:");
		department.departmentName = scan.nextLine();
	}

	public static void question7() {
		Scanner scan = new Scanner(System.in);
		int c;
		System.out.println("Nhap vao so chan");
		c = scan.nextInt();
		while (c % 2 != 0) {
			System.out.println("Nhap khong dung, nhap lai so moi:");
			c = scan.nextInt();
		}

	}

	public static void question8() {
		Scanner scan = new Scanner(System.in);
		int d;
		System.out.println("Moi ban nhap vao chuc nang muon su dung:");
		d = scan.nextInt();
		while (d != 1 && d != 2) {
			System.out.println("Moi ban nhap lai:");
			d = scan.nextInt();
		}
		if (d == 1) {
			User user1 = new User();
			question5(user1);
		} else {
			Department department1 = new Department();
			question6(department1);
		}
	}
	
}
