package fucnOne;
import java.util.Scanner;
public class ObjClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int result = Sum(num1,num2);
		
		System.out.println("Sum is : "+ result);

	}
	static int Sum(int num4, int num5) {
		int Total = num4+num5;
		return Total;
	}

}
