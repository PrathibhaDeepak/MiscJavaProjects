package primeClass;
import java.util.*;
public class AssignmentPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		int count = 0;
		
		
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				count++;
			}
			
			
			
		}
		if(count==2) {
			System.out.println("%d is a Prime number: " +num +count);
		}
		else {
			System.out.println(" " +num+" is not a Prime number: " +  count);
		}

	}

}
