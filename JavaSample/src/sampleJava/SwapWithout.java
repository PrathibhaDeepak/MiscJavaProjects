package sampleJava;

public class SwapWithout {

	public static void main(String[] args) {
		int a = 25, b = 50;
		
		a = a+b;
		//System.out.println(a);
		
		b = a-b;
		System.out.printf("b is : %d ",b);
		
		a = a-b;
		System.out.printf("\na is : %d", a);

	}

}
