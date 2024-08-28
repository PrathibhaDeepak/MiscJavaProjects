package arrayPack;

public class PracPat {

	public static void main(String[] args) {
		int num=5;
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("* ");}
			
		System.out.print("\n");	
		}
		for(int x=1; x<=num; x++) {
			for(int y=num-x; y>=0; y--) {
			System.out.print("* ");
		}
		System.out.print("\n");	
		}
			
	}

}
