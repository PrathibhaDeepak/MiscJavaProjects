package fucnOne;

import java.util.Scanner;

public class pracFact {
	public static int FactorialTest(int num1, int num2, int num3) {
		int prod = num1*num2*num3;
		
		return prod;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int num1 = input.nextInt();
		int fact = 1;
		for(int num=1; num<=num1; num++) {
			fact = fact*num;
			
		}
		System.out.printf("Product factorial %d: %d ", num1, fact);
		
		input = null;
		

	}

}
