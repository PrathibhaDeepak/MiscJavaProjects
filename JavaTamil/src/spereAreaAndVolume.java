import java.util.Scanner;

public class spereAreaAndVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare required variable
		double V, A, r;
		//double pi = 3.14;
		//Get User input for radius
		System.out.println("Enter the radius of the sphere: ");
		Scanner in = new Scanner(System.in);
		r = in.nextDouble();
		
		//Calculation
		V = 4*(22/7.0)*Math.pow(r,3)/3;
		A = 4*(22/7.0)*r*r;
		//Display result
		
		System.out.printf("Volume of the Sphere %f ",V);
		System.out.printf("\nArea of Sphere %f ", A);
	}

}
