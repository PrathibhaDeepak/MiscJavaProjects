package fucnOne;

public class OneStatic {
	 int a =10;
	 static int b =20;

	public static void main(String[] args) {
		OneStatic Bro = new OneStatic();
		OneStatic Sro = new OneStatic();
		
		Bro.a = 50;
		Bro.b = 20;
		Sro.b = 200;
		Sro.a = 500;
		
		System.out.println(Bro.a +"\n a:"  +Sro.a);
		System.out.println(Bro.b + "\n b:"  + Sro.b);


	}

}
