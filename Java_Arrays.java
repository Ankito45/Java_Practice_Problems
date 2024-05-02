package corejava;
import java.util.Arrays;
public class Java_Arrays {
/*
 * datatype[] arrayname;
 * dataype arrayname[];
 */
	void arrayDemo1() {
		int[] arrInt; //array Declaration
		arrInt = new int[5]; //allocate memory for java
//		Initialize array Elements
		arrInt[0] = 100;
		arrInt[1] = 101;
		arrInt[2] = 102;
		arrInt[3] = 103;
		arrInt[4] = 104;
		System.out.println("Access Array Element : " + arrInt[2]);
		for(int i:arrInt) {System.out.println("Array Element :" + i);}
	}
	
	void arrayDemo2() {
//		int[] arrInt = new int[5]; //declare and allocate memory
		int[] arrInt = {53,33,44,99,77};
		System.out.println("Array size is: " + arrInt.length);
		for(int i=0;i<arrInt.length;i++) {
			System.out.println("Array Elements are :" + arrInt[i]);
		}
	}
	public static void main(String[] args) {
		Java_Arrays obj = new Java_Arrays();
		obj.arrayDemo1();
		obj.arrayDemo2();
		obj.arrayDemo3();
	}
	/*
	 * Multidimensional array
	 * ------------------------------------
	 * datatype[][] arrayname = new datatype[no.of rows][no.of columns];
	 * datatype[][] arrayname = {{no.of rows},{no.of columns}};
	 */
	void arrayDemo3() {
		String[][] names= {{"Mr.","Mrs.","Miss."},{"Ankit","Nidhi","Shivanya"}};
		System.out.println(names[0][0]+names[1][0]);
		System.out.println(names[0][2]+names[1][1]);
		System.out.println(names[0][1]+names[1][2]);
		// update element
		names[1][2]="Anirudha";
		//traversing array
		for(int n=0;n<names.length;n++) {
			System.out.println(Arrays.toString(names[n]));
		}
	}	
}
