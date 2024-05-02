package corejava;

public class Java_Literals {
	
	public static void main(String[] args) {  
//		Integer Literals
		int decVra = 101;  //Decimal Literal
		int BinVar = 0b1111; //Binary Literal with base 2 and prefix 0b Digits 0-1 are allowed
		int octVar = 0146;  // Prefix for octal literal is 0 Digits 0-7 are allowed.
		int decVar = 101; //Decimal Literal with digits 0-9 are allowed.
		int hexVar = 0x123Face; //Hexadecimal Literal and digit allowed are 0-9 and characters allowed a-f
//		Floating-Point Literal
		float floatVar = 5.5f; //'f' is used because the every floating variable is considered as double due to which the f is used
		double doubleVar = 5.8; 
//		Character Literal
		char charVar = 'A'; // Character Literal 0 to 65535 Unicode!
		char uniChar = '\u0061'; //char Literal can specify in unicode representation '\u0061' represent 0061
		char escChar = '\n';
//		Boolean Literal
		boolean booleanFalse = false;
		boolean booleanTrue = true;
//		String Literal
		String stringVar = "Hello World";
	}
}
