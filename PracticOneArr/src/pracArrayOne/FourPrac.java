package pracArrayOne;

import java.util.Scanner;

public class FourPrac {
	public static int CalProd(int num1, int num2) {
		
		return num1*num2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter values:");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		
		int product = CalProd(num3,num4);
		
		System.out.printf("Product:%d*%d=%d ", num3,num4,product);

	}

}
