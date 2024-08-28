package NewPack;

public class RecursivePractice {
	static int count = 0;
	public static void main(String[] args) {
		p_finite();
		

	}
	static void p_finite() {
		count++;
		if(count<=5) {
			System.out.println("Hello" + count);
			//p_finte();
			}
	}
	
				
	

}
