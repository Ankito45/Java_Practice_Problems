package corejava;
/*
 * Implicit casting: small to larger
 * explicit casting: larger to small
 */
public class Java_TypeCasting {
	
	public static void main(String[] args) {  
		int intVar = 100;
//		Implicit Casting
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;
		
//		Explicit Casting
		intVar = (int)longVar;
		longVar = (long)floatVar;
		floatVar = (float)doubleVar;
		byte x = 5,y = 3;
		floatVar = multiplication(x,y);
	}
	static float multiplication(byte x,byte y) {
		return (float)x*y;
	}
}
