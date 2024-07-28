package com.vti.backend;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[]) {
		// Question1--------------------------------------------------
		System.out.println("Question1------------------------------");
		float salary1 = 5240.5f;
		roundSalary(salary1);
		float salary2 = 10970.055f;
		roundSalary(salary2);
		// Question2--------------------------------------------------
		System.out.println("Question2------------------------------");
		String number1 = generateRandomNumber();
		System.out.println(number1);
		// Question3--------------------------------------------------
		System.out.println("Question3------------------------------");
		String number2 = number1.substring(number1.length() - 2, number1.length());
		System.out.println(number2);
		// Question4--------------------------------------------------
		System.out.println("Question4------------------------------");
		float c = getQuotient();
		System.out.println("Thương 2 số a và b là: " + c);
		// Question5--------------------------------------------------
		System.out.println("Question5------------------------------");
	}

	public static void roundSalary(float salary) {
		int rs = (int) salary;
		System.out.println("Lương nhân viên sau khi làm tròn : " + rs);
	}

	public static String generateRandomNumber() {
		Random rand = new Random();
		Boolean sign = rand.nextBoolean();
		String number;
		if (sign) {
			number = "";
		} else {
			number = "-";
		}
		for (int i = 1; i <= 5; i++) {
			String digit = String.valueOf(rand.nextInt(9));
			number = number + digit;
		}
		return number;
	}

	public static float getQuotient() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số a: ");
		float a = scan.nextFloat();
		System.out.println("Nhập số b: ");
		float b = scan.nextFloat();
		scan.close();
		return a / b;
	}
}
