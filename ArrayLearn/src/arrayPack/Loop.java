package arrayPack;

public class Loop {

	public static void main(String[] args) {
		int num = 559;
		int count=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.printf("%d: is a Prime number",num);
		}
		else {
			System.out.printf("\n%d: is not a Prime number", num  );
		}
	}

}
