package functionsPack;

import java.util.Scanner;

public class functionClassOne {
	public static int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int sum = calculateSum(num1,num2);
		System.out.println(sum);

	}

}
