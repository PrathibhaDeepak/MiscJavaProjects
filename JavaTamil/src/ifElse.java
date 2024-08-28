import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Incentive,Salesamount;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the sales amount:  ");
		Salesamount = in.nextDouble();
		Incentive = 0;
		
		if(Salesamount<=10000) {
			Incentive = Salesamount*(5/100.0);			
			System.out.printf( "Your incentive is %.2f ", Incentive);
			
		}
		else if(Salesamount<=20000) {
			Incentive = Salesamount*(10/100.0);
			System.out.printf("Your incentive is %.2f" , Incentive);
		}
		else if(Salesamount<=30000) {
			Incentive = Salesamount*(15/100.0);
			System.out.printf("Your incentive is %.2f", Incentive);
		}
		else if(Salesamount<=120000) {
			Incentive = Salesamount*(25/100.0);
			System.out.printf("Your incentive is %.2f", Incentive);
		}
		else {
			System.out.printf( "No incentive available", Incentive);
		}
		/*
		//Calculation
		Incentive =0;
		Incentive = Salesamount*(10/100.0);
		 
		
		if(Salesamount>=10000) {
			System.out.printf("Your Insentive is %.2f" , Incentive);
			
		}
		else {
			System.out.println("No incentive available  ");
		}*/
	}

}
