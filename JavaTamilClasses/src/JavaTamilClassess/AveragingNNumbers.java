package JavaTamilClassess;
import java.util.Scanner;

public class AveragingNNumbers {
	private double Sum;
	private int N;
	
	public double getAverage() {
		return Sum/N;
	}
	public double getSum() {
		return Sum;
	}
	public double getN() {
		return N;
	}
	//Get the input and accumulate the Sum Value
	public void Start() {
		Scanner in = new Scanner(System.in);
		
		// Get N value
		System.out.print("How many numbers?");
		N = in.nextInt();
		
	// Repeatedly get N number and accumulate
		double nextN;
		
		//Initialize sum to 0
		
		for(int i=1; i<=N; i++) {
		// Ask next number
			System.out.print("?");
			nextN = in.nextDouble();
			
			//Accumulate
			Sum = Sum + nextN;
			
	}
		// Display the result
		System.out.printf("\nSum = %f average = %f", Sum,getAverage());

}
	}
	
