package functionsPack;

public class NewOne {
	int a, b, total;
	void add() {
		total = a + b;
	}

	public static void main(String[] args) {
		NewOne obj = new NewOne(); 
		obj.a = 10;
		obj.b = 20;
		obj.add();
		
		System.out.println("Addition = " + obj.total);

	}

}
