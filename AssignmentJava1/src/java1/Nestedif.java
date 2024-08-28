package java1;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		
		
		
		System.out.printf("1 for Addition \n2 for Substraction \n3 for Multiplication \n4 for Division\nEnter you choice:");
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter 2 digits:");
		int number = in.nextInt();
		//System.out.printf("Enter 2 digits");
		int num1=0;
		int num2 =0;
		int result = 0;
		int choice=0;
		if(choice==1) {
			result=num1+num2;
			
		}
		else if(choice==2) {
			result = num1-num2;	
		}
		else if(choice==3){
			result = num1*num2;
	}
		else if(choice==4) {
			result = num1/num2;
	
}		else {
			System.out.println("Invalid entry!");
}	System.out.printf("Result %d:", result);
		
	}}

