package swiPack;

import java.util.Scanner;

public class AssignmentBro {

	public static void main(String[] args) {
		int num, multiplier;
		System.out.printf("Enter a number:");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		 
		for(multiplier=1; multiplier<=10; multiplier++) {
			System.out.printf("%d x %d = %d \n" , multiplier,num, (multiplier*num));
		}

}
}