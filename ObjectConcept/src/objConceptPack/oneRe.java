package objConceptPack;

public class oneRe {
	static int count = 0;
	public static void main(String[] args) {
		p_finite();

	}
	public static void p_finite() {
		count++;
		if(count<=5) {
		System.out.println("Hello : "+ count);
		p_finite();}
	}

}
