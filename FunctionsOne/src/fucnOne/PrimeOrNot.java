package fucnOne;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int count = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}}
		if(count==2) {
			System.out.println(num+" : it is a prime number ");
			}
		else {
			System.out.println(num + ": It is not a prime number");
		}
		
		

	}	

}
