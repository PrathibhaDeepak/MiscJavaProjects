package functionsPack;
import java.util.*;
public class FunctionsJava {
	public static int sum(int num1, int num2) {
		int result;
		result = num1+num2;
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 number: ");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int result = sum(num3, num4);
		
		System.out.printf("Sum is : %d",result);
		
		

	}

}
