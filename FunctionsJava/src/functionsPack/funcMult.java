package functionsPack;
import java.util.Scanner;

public class funcMult {
	public static int CalculateProduct(int a, int b) {
		int Product = a*b;
		return Product;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int Product = CalculateProduct(a,b);
		
		System.out.printf("Product is: "+ Product );
		

	}

}
