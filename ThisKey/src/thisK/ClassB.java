package thisK;

public class ClassB extends ClassA {
	
	ClassB(){
		System.out.println("It is constructor B");
	}
	ClassB(int a){
		System.out.println("Argument constructor B");
	}
	
	void hello() {
		System.out.println("This is class B");}
		
	void hello1(){
		
		int one;
		one =10;
		super.one =75;
		int c = one+super.one;
		System.out.println(c);
		}
		
		
	
	
		
		
		
	

}
