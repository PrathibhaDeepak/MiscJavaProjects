package functionsPack;

public class PracStat {
	int num1 = 10;
	static int num2 = 25;

	public static void main(String[] args) {
		PracStat stat = new PracStat();
		 stat.num1 = 20;
		 stat.num2 = 55;
		 
		 stat.hello();
		 
		 System.out.println("Num1: " +stat.num1+ "\nNum2: " + stat.num2);
	}
	void hello() {
		System.out.println("Static Practice Section");
	}

}
