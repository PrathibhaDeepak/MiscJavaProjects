package sampleJava;

public class OddEvenSummation {

	public static void main(String[] args) {
		int sum=0,Tot=0;
		for(int i=0; i<=5; i++)
		{
			if(i%2==0)
			{
				sum= sum+i;
				
			}else
				Tot = Tot+i;
		}
		System.out.printf("\nEven number sum = %d ", sum);
		System.out.printf("\nOdd number sum = %d", Tot);
	}

}
