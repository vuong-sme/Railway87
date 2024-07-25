package com.vti.backend;

public class Excercise6 {
	public static void main(String args[]) {
		// Exercise6/Question1---------------------------
		question1();
		// Exercise6/Question1---------------------------
		User user1 = new User();
		question2(user1);
		// Exercise6/Question1---------------------------
		question3();
	}

	public static void question1() {
		System.out.printf("Cac so chan nguyen duong nho hon 10 la: ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			} else {
				System.out.printf(" %s ;", i);
			}
		}
		System.out.printf("%n");
	}

	public static void question2(User user) {
		System.out.printf("Ten user: ");
		System.out.println(user.userName);
		System.out.printf("Phong ban: ");
		System.out.println(user.department.departmentName);

	}

	public static void question3() {
		System.out.printf("Cac so nguyen duong nho hon 10 la: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %s ;", i);
		}
	}

}
