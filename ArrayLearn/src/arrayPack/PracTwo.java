package arrayPack;

public class PracTwo {

	public static void main(String[] args) {
		int num = 10;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("$ ");
			
		}
		System.out.println();	
		}
		for(int x=1; x<=num; x++) {
			for(int y=num-x; y>=0; y--) {
			System.out.print("$ ");
		}
		System.out.println();	
		}

	}

}
