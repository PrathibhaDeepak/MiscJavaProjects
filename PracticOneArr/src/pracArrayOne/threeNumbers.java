package pracArrayOne;

import java.util.Scanner;


public class threeNumbers {
	public static int Product(int one, int two, int three) {
		int prod = one*two*three;
		return prod;
	}
	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first number: ");
		num1 = input.nextInt();
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		System.out.println("Enter third number: ");
		num3 = input.nextInt();
		
		int prod = Product(num1,num2,num3);
		
		System.out.println("Product is: " + prod);
		
		
		input = null;
		
		
		
		

	}

}
