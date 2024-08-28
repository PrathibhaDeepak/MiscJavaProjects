package fucnOne;
import java.util.*;

public class FunctionsWithoutArg {
	public static int Product() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int product = num1*num2;
		return product;
		
	}

	public static void main(String[] args) {
		int k = Product();
		System.out.printf("Product is :%d", k);

	}

}
