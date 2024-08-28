package JavaTamilClassess;

public class ForTwo {

	public static void main(String[] args) {
		int lc = 1;
		for(int i = 2; i<=200; i+=2, lc++) {
			System.out.printf("%4d ", i);
			if(lc%8==0) {
				System.out.print("\n ");
			}
		}
	}

}
