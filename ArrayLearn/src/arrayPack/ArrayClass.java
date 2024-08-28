package arrayPack;

public class ArrayClass {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=1; i<=5; i++) {
			if(i%2==1) {
				count ++;
			}
			else {
				System.out.printf("\nEven: "+i);
			}
		}
		System.out.printf("\nOdd numbers are: %d",count);
	
	
	}

}
