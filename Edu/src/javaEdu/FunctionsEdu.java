package javaEdu;

public class FunctionsEdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle: " + RectAngleArea(15,10));
		System.out.println("Perimeter of Rectanle: " + RectAngleArea(15,10));
		

	}
	public static int RectAngleArea(int length, int breadth) {
		return length * breadth;
	}
	public static int RectAnglePerimeter(int length, int breadth) {
		return 2*(length+breadth); 
	}
}
