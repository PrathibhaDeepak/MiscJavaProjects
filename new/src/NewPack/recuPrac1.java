package NewPack;

public class recuPrac1 {
	public static int count = 0;
	public static void main(String[] args) {
			
		one_finite();
	}
	static void one_finite() {
		count ++;
		if(count<=5) {
			System.out.println("Hello: ");
			one_finite();
			
		}
	}

}
