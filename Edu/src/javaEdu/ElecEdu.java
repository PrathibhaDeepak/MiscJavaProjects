package javaEdu;

import java.util.Scanner;

public class ElecEdu {

	public static void main(String[] args) {
		int age = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter your age: ", age);
		
		age = in.nextInt();
		
		if(age>=18) {
			System.out.printf("You are eligible to vote ", age);
		}
		else {
			System.out.printf("Under 18 not permited to vote", age);
			
		}
		}
	
}

