package javaEdu;

public class callByValue {
	public static void increase(int p) {
		p+=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		increase(a);
		System.out.println("Value of a: " + a);
	}

}
