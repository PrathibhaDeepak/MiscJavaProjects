import java.util.Scanner;

public class fiveLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variable;
		//String res = "";
		String s;
		String res = "";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a five letter word: ");
		s = in.nextLine();
		
		res = res+Character.toString((char)(s.charAt(0)-1));

		res = res+Character.toString((char)(s.charAt(1)-1));

		res = res+Character.toString((char)(s.charAt(2)-1));
		res = res+Character.toString((char)(s.charAt(3)-1));

		res = res+Character.toString((char)(s.charAt(4)-1));
		
		System.out.print(res);
		
		

	}

}
