package sampleJava;

import java.util.Scanner;

public class DivisibleNum {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num%5==0) {
			System.out.printf("%d Divisible by 5 ");
		}
		else
		{
			System.out.printf("Not Divisible by 5: %d",num);
		}
	}

}
