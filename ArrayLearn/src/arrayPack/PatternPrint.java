package arrayPack;

public class PatternPrint {

	public static void main(String[] args) {
		int col=10;
		for(int i=1; i<=col; i++)
		{for(int j=1; j<=i; j++)
			{System.out.print("");
		}
		for(int j=0; j<=col-i; j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
}	}
