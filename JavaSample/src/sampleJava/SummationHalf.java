package sampleJava;

public class SummationHalf {
// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7
	public static void main(String[] args) {
		double sum = 0;
		
		for(double i=1; i<=7; i++) {
			sum = sum+i/(i+1);
			
		}
		System.out.println(sum);
	}

}
