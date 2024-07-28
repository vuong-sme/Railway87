package com.vti.backend;

public class Exercise3 {
	public static void main(String args[]) {
		// Question1--------------------------------------------------
		System.out.println("Question1------------------------------");
		Integer salary = 5000;
		float convertedSalary = Integer.valueOf(salary);
		System.out.printf("Salary: %.2f %n", convertedSalary);
		// Question2--------------------------------------------------
		System.out.println("Question2------------------------------");
		String s = "1234567";
		int convertedS = Integer.parseInt(s);
		System.out.println(convertedS);
		// Question3--------------------------------------------------
		System.out.println("Question3------------------------------");
		Integer i = 1234567;
		int convertedI = Integer.valueOf(i);
		System.out.println(convertedI);
	}
}
