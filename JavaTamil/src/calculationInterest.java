import java.util.Scanner;

public class calculationInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Total, Percentage;
		int Year;
		double InterestTotal;
		
		Scanner put = new Scanner(System.in);
		
		System.out.printf("Enter total salary: \n");
		Total = put.nextDouble();
		
		System.out.println("Enter percentage: ");
		Percentage = put.nextDouble();
		
		System.out.printf("Enter years please: ");
		Year = put.nextInt();
		
		InterestTotal = Total * Percentage * Year/100;
		
		System.out.printf("Total amount is =%.2f ", InterestTotal);
		
		
		
		

	}

}
