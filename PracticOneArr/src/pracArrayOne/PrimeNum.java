package pracArrayOne;

import java.util.Scanner;

public class PrimeNum {
	public static int CheckPrime(int mark1, int mark2) {
		int sum = mark1 + mark2;
		return sum;
	}

	public static void main(String[] args) {
		int num1, num2;
		Scanner mark = new Scanner(System.in);
		System.out.printf("Enter first mark: " );
		int num11 = mark.nextInt();
		System.out.printf("Enter second mark: " );
		int num21 = mark.nextInt();
		int mark1 = CheckPrime(num11, num21);
		
		System.out.println(mark1);
	}

}
