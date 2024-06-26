package corejava;
/*
 * Its not thread safe : multiple threads can access it simultaneously 
 * Its not synchronized
 * Its Mutable
 * 
 */
public class Java_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sbObj1=new StringBuilder();
		StringBuilder sbObj2=new StringBuilder("Java");
		System.out.println("sbObj1 = "+sbObj1+" Length : "+sbObj1.length());
		System.out.println("sbObj2 = "+sbObj2+" Length : "+sbObj2.length());
		//append()
				sbObj2.append(" and Rust");
				System.out.println("sbObj2.append(\" and Rust\") : "+sbObj2);
		//insert()
				sbObj2.insert(4," HI \n");
				System.out.println("sbObj2.insert(4,\" HI \\n\") : "+sbObj2);
		//reverse()
				sbObj2.reverse();
				System.out.println("sbObj2.reverse() : "+sbObj2);
		//capacity()
				System.out.println("Length : "+sbObj1.length());
				System.out.println("Length : "+sbObj2.length());
				System.out.println("sbObj1.capacity() : "+sbObj1.capacity());//Empty Constructor reserve space for 16 characters in default 
				System.out.println("sbObj2.capacity() : "+sbObj2.capacity()); // 20 
		//ensureCapacity()
				sbObj1.ensureCapacity(15);
				//if the argument of ensure capacity is less than the existing capacity ,then there will be no change in existing capacity
				System.out.println("sbObj1.capacity() : "+sbObj1.capacity());//16 default
				//if the argument of ensure capacity is greater than the existing capacity,then there will be change in existing capacity 
				//using rule -> newCapacity=(oldCapacity*2)+2
				sbObj2.ensureCapacity(25); // (20*2)+2 = 42
				System.out.println("sbObj2.capacity() : "+sbObj2.capacity()); // 42

	}
}