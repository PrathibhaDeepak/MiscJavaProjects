package thisK;

public class KeySample {
	int a, b;
	
	KeySample(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("a:" + this.a + "\nb:"+ this.b);
	}
	 void display() {
		System.out.printf("a:",this.a,"b:", this.b);
	}
}
