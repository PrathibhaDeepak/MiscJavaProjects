package areaCircle;

import java.util.Scanner;

public class CircleArea {

	private static final String Scanner = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare required variables;
		float r, area;
		
		// Get User Input for Radius
		
		System.out.println("Please enter Radius: ");
		Scanner in = new Scanner(System.in);
		r = in.nextFloat();
		
		//Calculation
		area = (float) (3.14)*r*r;
		
		//Display area of Circle
		
		System.out.printf("Area of Circle: %.2f is %.2f", r, area);
		

	}

}
