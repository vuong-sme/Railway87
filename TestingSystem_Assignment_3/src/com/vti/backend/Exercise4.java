package com.vti.backend;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[]) {
		// Question1--------------------------------------------------
		System.out.println("Question1------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào 1 câu: ");
		String s = scan.nextLine();
		int c = countWords(s);
		System.out.printf("Câu vừa nhập có %s từ %n", c);
		// Question2--------------------------------------------------
		System.out.println("Question2------------------------------");
		System.out.println("Nhập vào xâu kí tự s1: ");
		String s1 = scan.nextLine();
		System.out.println("Nhập vào xâu kí tự s2: ");
		String s2 = scan.nextLine();
		System.out.println("Xâu ký tự sau khi nối s1 với s2: " + (s1 + s2));
		// Question3--------------------------------------------------
		System.out.println("Question3------------------------------");
		System.out.println("Nhập tên: ");
		String name = scan.nextLine();
		String convertedName = vietHoaChuCaiDau(name);
		System.out.println("Tên sau khi viết hoa chữ cái đầu: " + convertedName);
		// Question3--------------------------------------------------
		System.out.println("Question3------------------------------");
		printCharacter();
		// Question4--------------------------------------------------
		System.out.println("Question4------------------------------");
		printFullName();
	}

	public static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
				for (int j = 0; j < (s.length() - i); j++) {
					if (s.charAt(i) == ' ') {
						i++;
					} else {
						break;
					}
				}

			}
		}
		count++;
		return count;
	}

	public static String vietHoaChuCaiDau(String s) {
		char c = s.charAt(0);
		s = Character.toUpperCase(c) + s.substring(1);
		return s;
	}

	public static void printCharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scan.nextLine();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			System.out.printf("Ký tự thứ %s là: %c %n", (i + 1), c);
		}
	}

	public static void printFullName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ: ");
		String familyName = scan.nextLine();
		System.out.println("Nhập tên: ");
		String name = scan.nextLine();
		String fullName = familyName + " " + name;
		System.out.println("Họ tên đầy đủ: " + fullName);
	}
}
