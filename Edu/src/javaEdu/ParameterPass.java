package javaEdu;

public class ParameterPass {
	public static int sum(int num1, int num2)//formal parameters(called method)
	{
		int addition = num1 + num2;
		return addition;
	}

	public static void main(String[] args) {
		int  a = 10, b = 20, c;
		c = sum(a,b);
		System.out.print("Sum is " + c); // actual parameters(calling method)

	}
	

}
