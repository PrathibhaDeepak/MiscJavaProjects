package softwareTesting;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		
		switch(age) {
		case (21): System.out.println("Not eligible for voting"); 
		break;
		case(25): System.out.println("Eligible for voting");
		break;
		default: System.out.println("Invalid entry");
		}
		input.close();

	}

}
