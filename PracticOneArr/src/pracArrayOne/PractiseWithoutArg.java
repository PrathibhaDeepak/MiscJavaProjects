package pracArrayOne;

import java.util.Scanner;

public class PractiseWithoutArg {
	public static void Sum(int num1, int num2) {
		int result = num1 + num2;
		
		System.out.printf("result is:  %d", result);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		Sum(num3,num4);
		
	}

}
