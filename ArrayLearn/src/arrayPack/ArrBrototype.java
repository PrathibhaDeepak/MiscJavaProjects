package arrayPack;

public class ArrBrototype {

	public static void main(String[] args) {
		int num=7;
	
		int count = 0;
	
	for(int i=0; i<=num; i++) {		
		if(num%i==0) {
			count++;
		}
		if(count==2) {
			System.out.print("Prime Number");
	
		}
		else {
			System.out.print("Not a Prime");
		}
	}

	}

}
