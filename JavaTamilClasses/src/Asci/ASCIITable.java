package Asci;

public class ASCIITable {

	public static void main(String[] args) {
		DisplayAscii  da = new DisplayAscii();
		da.readInput();
		da.displayASCIITable();
		da = null;
	}

}
