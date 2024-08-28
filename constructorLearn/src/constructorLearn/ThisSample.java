package constructorLearn;

public class ThisSample {
	int a = 100, b = 200;
	
	ThisSample(int a, int b){
		this.a = a;
		this.b = b;
		a = this.a;
		b = this.b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);

	}

}
