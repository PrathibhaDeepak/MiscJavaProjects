import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare required variables
		float r, area;
		
		// User input for Radius
		
		System.out.println("Enter radius: ");
		Scanner in = new Scanner(System.in);
		r = in.nextFloat();
		
		//Calculation
		area = (float) (3.14*r*r);
		
		//Display area
		
		System.out.printf("Area of circle with radius %.2f is %.2f", r, area);
		
		
		
		
		/*
		//Declare variable
		
		float r, area;
		//Get user input for Radius
		System.out.println("Enter radius: ");
		Scanner in = new Scanner(System.in);
		r = in.nextFloat();
		
		//Calculation
		area = (float) (3.14*r*r);
		
		// Display Area of Circle
		System.out.printf("Area of Circle of %.2f of %.2f is  ", r, area);
		*/

	}

}
