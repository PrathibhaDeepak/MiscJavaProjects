import java.util.Scanner;

public class basicSalesPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare required variables
		double grade, salesPrice, basic;
		
		//Get user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter basic sales price: ");
		salesPrice = in.nextDouble();
		System.out.println("Enter the grade: ");
		grade = in.nextDouble();
		
		
		
		//Calculation
		
		if(grade==1) {
			
			System.out.printf("Basic sales price %f ", salesPrice);
			
		}
		else if(grade==2) {
			basic = salesPrice+(10/100.0*salesPrice);
			System.out.printf("Basic sales for grade two %2f",basic);
		}
		else if(grade==3) {
			basic = salesPrice+(15/100.0*salesPrice);
			System.out.printf("Basic sales for grade two %2f",basic);
		}
		else if(grade==4) {
			basic = salesPrice+(20/100.0*salesPrice);
			System.out.printf("Basic sales for grade two %2f",basic);
		}
		else if(grade==5) {
			basic = salesPrice+(25/100.0*salesPrice);
			System.out.printf("Basic sales for grade two %2f",basic);
		}
		else {
			System.out.println("Not applicable");
		}
		
		//Display result
	}
 
}
