package corejava;

public class Java_Garbage_Collection {

	public static void main(String[] args) {
		Java_Garbage_Collection obj = new Java_Garbage_Collection();
		obj = null; //ready to garbage collect
		Java_Garbage_Collection obj1 = new Java_Garbage_Collection();
		Java_Garbage_Collection obj2 = new Java_Garbage_Collection();
		obj1=obj2; //non-reference
		System.out.println("before explicitally call gc().....");
		System.gc();
	}
	
	public void finalize() {
		/*
		 * Finalize method is called by garbage collection thread before collecting the object
		 * Finalize method is used to perform specific task before object destroy.
		 * Finalize method is defined in java.lang.Object
		 * Finalize method is declared as protected modifier inside Object Class
		 * Finalize method is only called once by garbage collector thread
		 */
		System.out.println("Execute Before Java Collector");
	}
}
