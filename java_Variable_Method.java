package corejava;
/*
 * Instance Variable
 */
public class java_Variable_Method {
//	Instance Variable
	byte byteVar;
	short shortVar;
	int intVar;
	long longVar;
	float floatVar;
	double doubleVar;
	char charVar;
	boolean booleanVar;
	
//	Static Variable
	static int intStaticVar = 0;
	
//	Method without return type and parameter
	void method1() {
		System.out.println("Acesss Instance Variable inside Instance method" + intVar);
		System.out.println("Access Static variable inside Instance Method" + intStaticVar);
		System.out.println("Access Static variable inside Instance Method" + java_Variable_Method.intStaticVar);
		int x = 5; //Local Variable
	}
	
//	Method with return type and without parameter
	int method2() {
		System.out.println("Method with return type and without parameter");
		return 2;
	}
	
//	Method with return type and parameter
	float method3(float x, float y) {
		System.out.println();
		return x + y;
	}
	
//	Method without return type and with parameter
	void method4(int i) {
		System.out.println("Method without return type and with argument : i=" + i);
	}
	
	public static void main(String[] args) {  
		java_Variable_Method obj = new java_Variable_Method();  //Create object
		obj.method1(); //method call
		int a  = obj.method2();
		float b = obj.method3(5.5f, 6.6f);
		obj.method4(a);
		System.out.println("Acess Instance variable inside Static method : "+ obj.byteVar);
		System.out.println("Acess Static variable inside Static method : "+ intStaticVar);
		System.out.println("Access Static variable inside Instance Method" + java_Variable_Method.intStaticVar);
		staticMethod();
	}
	
	static void staticMethod() {
		System.out.println("It's static method");
	}
}
