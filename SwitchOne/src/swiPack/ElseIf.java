package swiPack;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		System.out.println("\n 1 for Dosa \n 2 for Idli \n 3 for Vada \n Enter your choice:");
		int choice = 0;
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		if(choice==1) {
			System.out.print("Your choice is Dosa");
		}
		else if(choice==2){
			System.out.print("Your choice is Idli");
		}
		else if(choice==3) {
			System.out.print("Your choice is Vada");
		}
		else {
			System.out.print("Please enter a valid choice");
		}
	}

}
