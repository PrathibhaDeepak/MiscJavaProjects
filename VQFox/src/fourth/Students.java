package fourth;

public class Students {

	public static void main(String[] args) {
		TenthGrade Ten = new TenthGrade();
		TenthDetails Tenth = new TenthDetails();
		
		Ten.name = "Anku";
		Ten.age = 15;
		Ten.marks = 98;
		Tenth.Grade = 'A';
		
		Ten.girls();
		Ten.girls(22);
		Ten.exam();
		Tenth.grades();
		
		
	}

}
