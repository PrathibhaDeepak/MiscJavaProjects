package arrayPack;

public class ArrayCla {

	public static void main(String[] args) {
		int num=4;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
			sum = sum+i;
		}
		System.out.printf("Sum is: %d\n", sum);
		//int [] marks;
		//marks = new int[4];
		
		//int[] marks = new int[4];
		int marks [] = {85,89,90,98};
		System.out.printf("%d bytes\n", sizeof(marks));
		for(int k=0; k<marks.length; k++) {
			System.out.printf("\nMarks: %d ", marks[k]);
		}
		
	}

	private static Object sizeof(int[] marks) {
		// TODO Auto-generated method stub
		return null;
	}	

}
