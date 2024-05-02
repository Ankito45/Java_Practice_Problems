package corejava;

public class Java_Constructor {
	int intVarInstance = 0;
	int intVarInstance1;
	static int intVarStatic = 0;
	int a,b,c;
	float d;
//	Non parametrized Constructor
	public Java_Constructor() {
		intVarInstance++;
		System.out.println("Non Parameterized Constructor with Inatnce Var variable value = " + intVarInstance);
		a=10;
	}//Constructor 1
//	Parameterized Constructor
	public Java_Constructor(int x) {
		intVarInstance = x;
		System.out.println("Parameterized Constructor with Inatnce Var variable value = " + intVarInstance);
		this.b=x; //Access Instance Variable using THIS keyword
	}//Constructor 2
		public Java_Constructor(int x, int y) {
		this(5); // Call Constructor 2 here
		intVarInstance = x;
		intVarInstance1 = y;
		System.out.println("Parameterized Constructor with Inatnce Var variable value = " + intVarInstance + " Second value is = " + intVarInstance1);
		c=y;
	}// Constructor 3
	public Java_Constructor(String a) {
		this(8,9);// Call Constructor 3 here
		intVarStatic++;
		System.out.println("Parameterized Constructor with static variable value = " + intVarStatic);
		d=5.5f;
	}//Constructor 4
	public static void main(String[] args) {
		Java_Constructor obj1 = new Java_Constructor(); //Constructor 1 call here
		Java_Constructor obj2 = new Java_Constructor(10); //Constructor 2 call here
		Java_Constructor obj3 = new Java_Constructor(5 , 6); //Constructor 3 call here
		Java_Constructor obj4 = new Java_Constructor("Ankit"); //Constructor 4 call here
//		---------------------------------------------------------------------------------
		Java_Constructor obj5 = new Java_Constructor(); //Constructor 1 call here
		Java_Constructor obj6 = new Java_Constructor(); //Constructor 1 call here
//		---------------------------------------------------------------------------------
		Java_Constructor obj7 = new Java_Constructor("Java"); //Constructor 4 call here
		Java_Constructor obj8 = new Java_Constructor("Python"); //Constructor 4 call here
	}
	void greetme() {
		System.out.println("Hello");
	}
	void greetHim() {
		this.greetme();
	}
}
