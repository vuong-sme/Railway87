package com.vti.backend;

import java.util.Date;

public class Program {
	public static void main(String args[]) {
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phong HR";
		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phong R&D";
		//----------------------------------
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = "Mananger";
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = "Leader";
		//-----------------------------------
		User user1 = new User();
		user1.id = 1;
		user1.userName = "Hoang";
		user1.passWord = "21345546";
		user1.department = department1;
		user1.gender = Gender.MALE;
		user1.dateOfBirth = new Date("1996/08/15");
		User user2 = new User();
		user2.id = 2;
		user2.userName = "Nam";
		user2.passWord = "34124124";
		user2.department = department1;
		user2.gender = Gender.MALE;
		user2.dateOfBirth = new Date("1995/09/28");
		//-----------------------------------
		System.out.println("Ten user1: "+ user1.userName);
		System.out.println("Phong ban user2: "+ user1.department.departmentName);
		System.out.println("Ngay sinh user1: "+ user1.dateOfBirth);
		System.out.println("Gioi tinh user1: "+ user1.gender);
		
		System.out.println("Ten user2: "+ user2.userName);
		System.out.println("Phong ban user2: "+ user2.department.departmentName);
		System.out.println("Ngay sinh user2: "+ user2.dateOfBirth);
		System.out.println("Gioi tinh user2: "+ user2.gender);
	}

}
