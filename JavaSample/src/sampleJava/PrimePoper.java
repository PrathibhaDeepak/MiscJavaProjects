package sampleJava;

import java.util.Scanner;

public class PrimePoper {

	public static void main(String[] args) {
		int num;
		int count=0;
		System.out.print("Enter a number : ");
		Scanner input = new Scanner(System.in);
		 num = input.nextInt();
		
		input.close();
		 
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.printf("%d is a Prime Number", num);
			
		}
		else {
			System.out.printf("%d is not a Prime Number", num);
		}
	}

}
