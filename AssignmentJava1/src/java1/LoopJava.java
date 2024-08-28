package java1;

public class LoopJava {
	public static int greaterthan(int a, int b) {
		if(a>b) {
			
			return a;

		}
		else
			
		return b;
	}

	public static void main(String[] args) {
		int a = 7, b = 8;
		int ans = greaterthan(a,b);
		System.out.println(ans);
		//System.out.println("B is greater than A: " +b);

		
		
		
		/*	out:
		for(int i=1; i<=5; i++) {
			System.out.println("Outer: " + i);
		for(int j=1; j<=5; j++) {
			if(j==2)
				

				continue out ;
			System.out.println("  Inner: " + j);
			
		}
		}
		
		  out:
		for(int i=1; i<=5; i++) {
			System.out.println("From outer: " + i);
			for(int j=1; j<=5; j++) {
				System.out.println("    From inner: " + j);
					
				if(j==2) {
					break  out;
					}
				}
			}
		
		
		int num = 50;
		int i;
		
		for(i = 1; i<=num; i++) {
			if((i % 3 == 0)|| (i % 5 == 0) || (i % 7 == 0)){
				System.out.println(i);
				
			}
		}
		
		
		
		 
		
			int num = 100;
		int i = 1; int sum = 0;
		 while(i<=100) {
			 sum+=i;
			 i++;
		 }
		 System.out.println("Summation of 1 to 100: " +  sum );
		
		
		 int num = 10;
		 int i = 1  ;
		 while(i<=10) {
			 
			 
			System.out.println(i); 
			i++;
		 } */
	}

}
