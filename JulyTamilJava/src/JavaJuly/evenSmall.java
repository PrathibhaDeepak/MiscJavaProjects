package JavaJuly;

public class evenSmall {
	public void FindSum(){
		int i;
		int sum = 0;
		
		for(i=2; i<=30; i+=2) {
			sum += i;
			System.out.println(i);
		}
		System.out.printf("Sum of integers 2 to 30:  %d ", sum);
	}
}
