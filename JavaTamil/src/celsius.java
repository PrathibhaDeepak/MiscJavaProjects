import java.util.Scanner;

public class celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double C, F;
		System.out.println("Enter the temperature: ");
		Scanner in = new Scanner(System.in);
		F = in.nextDouble();
		
		C = (5/9.0)*(F-32);
		
		System.out.printf("F %.2f of  C %.2f " , F,C);
		
		
		//Declare required variables
		/*
		double C, F;
		double result;
		//Get user input
		System.out.println("Enter the temperature: ");
		Scanner in = new Scanner(System.in);
		F = in.nextDouble();
		// Calculation
		C = (5/9.0)*(F-32);
		
		
		System.out.printf("Temperature in %f in Celsius is %f  ",F,C);
		*/

	}

}
