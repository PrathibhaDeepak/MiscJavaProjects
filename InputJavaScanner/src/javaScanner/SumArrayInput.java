package javaScanner;

import java.util.Scanner;

public class SumArrayInput {

	
	public static void main(String[] args) {
		
		int num;
		int limit;
		int sum = 0;
		
		int [] val = {10,20,30,40,50};
		
		for(int i=0; i<val.length; i++) {
			sum = sum+val[i];
		}
		
		System.out.printf("Sum of the Array is %d ", sum);		

		

	}

}
