package firstPack;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		int num, result;
		System.out.print("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for(int mult=1; mult<=10; mult++) {
			result = num*mult;
			
			System.out.printf("%d * %d = %d",mult,num,result);
		}
	}

}
