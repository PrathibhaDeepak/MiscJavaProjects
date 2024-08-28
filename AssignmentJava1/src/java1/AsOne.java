package java1;

import java.util.Scanner;

public class AsOne {

	public static void main(String[] args) {
		int numb;
		int multi;
		System.out.printf("Enter a number: ");
		Scanner input = new Scanner(System.in);
		numb = input.nextInt();
		input.close();
		for(int multiply=1; multiply<=10;multiply++) {
			multi = numb*multiply;
			System.out.printf("\n%d * %d = %d", multiply,numb,multi);
		}
	}

}
