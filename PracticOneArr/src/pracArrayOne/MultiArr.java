package pracArrayOne;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArr {

	public static void main(String[] args) {
		//int limit;
		int i, j;
		
		int values [][] ;
		values = new int [4][4];
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the limit: ");
		int limit = input.nextInt();
		
		System.out.print("Enter the values: ");
		for( i=0; i<values.length; i++) {
			for(j=0; j<values.length; j++){ {
				values[i][j] = input.nextInt();
			//System.out.printf("\n i = %d: j = %d",i,j);
		
			}
		
		}
		
		System.out.printf("%d", values[i][j]);
		}	 
		
	}
}
		

	



