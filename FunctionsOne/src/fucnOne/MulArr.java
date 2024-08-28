package fucnOne;

import java.util.Scanner;

public class MulArr {
	public static int Product(int a, int b) {
		int prod = a*b;
		
		return prod;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int Prod;
		Prod = Product(num1,num2);
		
		System.out.println("Product is: "+ Prod );

	}

}
