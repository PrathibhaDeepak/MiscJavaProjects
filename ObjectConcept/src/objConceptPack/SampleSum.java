package objConceptPack;

public class SampleSum {

	public static void main(String[] args) {
		Sum obj1 = new Sum();
		Sum obj2 = new Sum();
		
		obj1.a = 10;
		obj1.b = 20;
		obj2.a = 60;
		obj2.b = 80;
		
		obj1.CalculateSum();
		obj2.CalculateSum();
		
		obj1.display();
		obj2.display();
		
		Object Sum = null;

	}

}
