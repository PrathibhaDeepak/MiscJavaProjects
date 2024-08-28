import java.util.Scanner;

public class EnString {
	private String _originalString;
	private String _encryptedString;
	
	public String _originalString1;
	{
	
	}
	public String encriptedString() {
		
		return encriptedString();
	}
	public void getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Input String:\n");
		in.nextLine();
		
		
	}
	public String encrypt() {
		_encryptedString = new String();
		_encryptedString = "";
		
		char c;
		for(int i=0; i<_originalString.length()-1; i++) {
			String _originaString = null;
			c = _originaString.charAt(i);
			c = (char)((int)c-1);
			_encryptedString += Character.toString(c);
		}
		return _encryptedString;
	}

}
