package pracArrayOne;

import java.util.Scanner;

public class PracFunction {
	public static int Prod(int num1, int num2) {
		return num1*num2;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values: ");
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		int product = Prod(num4, num5);
		
		
		System.out.printf("Product is: "+ product);
		
		char name[];
		System.out.println("\nEnter a name:");
		String name1 = input.next();
		
		System.out.printf("\nEntered name is: " + name1);
		
				
	}

}
