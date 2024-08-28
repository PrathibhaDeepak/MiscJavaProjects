package primeClass;

public class AssignmentMethod {

	public static void main(String[] args) {
		
		Methods Meth1 = new Methods();
		Methods Meth2 = new Methods();
		Methods Meth3 = new Methods();
		Methods Meth4 = new Methods();
		
		Meth1.num1 = 100;
		Meth1.num2 = 20;
		
		Meth2.num1 = 45;
		Meth2.num2 = 5;
		
		Meth3.num1 = 25;
		Meth3.num2 = 10;
		
		Meth4.num1 = 10;
		Meth4.num2 = 11;
		
		int ans1 = Meth1.Multiplication();
		int ans2 = Meth2.Division();
		int ans3 = Meth3.Subtraction();
		int ans4 = Meth4.Addition();
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		
		

	}

}
