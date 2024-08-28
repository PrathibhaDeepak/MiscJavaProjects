package ClassOnePack;

public class FirstClass {

	public static void main(String[] args) {
		SecondClass ob1 = new SecondClass();
		SecondClass ob2 = new SecondClass();
		
		ob1.one = 10;
		ob2.two = 20;
		ob1.two = 30;
		ob2.one =40;
		
		System.out.println("1 one: " + ob1.one + "\n2 two: " + ob2.two);
		System.out.println("3 one: " + ob1.two + "\n4 two: " + ob2.one);
		
		ob1.display();
		ob2.display();

	}

}
