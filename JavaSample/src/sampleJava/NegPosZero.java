package sampleJava;

public class NegPosZero {

	public static void main(String[] args) {
		int num = 0;
		
		if(num>0) {
			System.out.printf("%d: is Positive",num);
			
		}
		else if(num<0) {
			System.out.printf("%d: is Negative",num);
		}
		else {
			System.out.printf("%d: is Zero", num);
		}

	}

}
