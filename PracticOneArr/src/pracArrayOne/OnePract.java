package pracArrayOne;

import java.util.Scanner;

public class OnePract {

	public static void main(String[] args) {
		int searchKey=0;
		int limit;
		int values = 0;
		int  flag = 0;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the limit:");
		limit = input.nextInt();
		System.out.printf("\nEner the values:",values);
		for(i=1; i<=limit; i++) {				
		values = input.nextInt();
		}
		System.out.print("Please enter searchKey: ");
		searchKey = input.nextInt();
		for(int j=1; j<=limit; j++) {
			if(searchKey==values) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.printf("Value found at position %d", i+1);
		}
		else {
			System.out.printf("Value not found");
		}
		
		
		input.close();
		
		
		
	}
}