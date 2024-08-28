package swiPack;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
			int choice;
		System.out.print("\n 1 for Parotta\n 2 for Biryani \n 3 for Fried Rice \n 4 for Mandhi\n Select your choice:");
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		System.out.printf("Enter your choice: ", choice);
		switch(choice){
			case 1:
			System.out.print("You have selected Parotta");
			break;
			case 2:
				System.out.print("You have selected Biriyani");
				break;
			case 3:
				System.out.print("You have selected Fried Rice");
				break;
			case 4:
				System.out.print("You have selected Mandhi");
				break;
			default:
				System.out.print("This is not available");
		}
	
	
	}

}
