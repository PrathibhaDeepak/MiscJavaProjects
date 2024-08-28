package arrayPack;

public class arrAdd {

	public static void main(String[] args) {
		int [] one = {10,20,30};
		int [] two = {40,50};
		int len = one.length + two.length;
		
		int [] three = new int[len];
		
		for(int i=0; i<one.length; i++) {
			three[i] = one[i];
		}      // 10  20  30
		int j=0;
		for(int i=one.length; i<three.length; i++) {
			three[i] = two[j]; //two[3]
			j++;
		}
		for(int i=0; i<three.length; i++)
		System.out.println(three[i]);
	}		
				
}
