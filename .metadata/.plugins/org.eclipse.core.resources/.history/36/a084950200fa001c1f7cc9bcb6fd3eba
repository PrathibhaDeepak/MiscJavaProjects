package Asci;
import java.util.Scanner;

public class DisplayAscii {
	private String inString;
	
	public String getInputString()
	{
		return inString;
	}
	// Method to get input from user
	public String readInput() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String: \n");
		inString = in.nextLine();
		return inString;

	}
	public void displayASCIITable() {
		char c;
		for(int i=0; i<inString.length(); i++) {
			c = inString.charAt(i);
			System.out.printf("\n%c %d",c, (int)c);
		}
	}

}

