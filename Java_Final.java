package corejava;

public class Java_Final {
final float PI_VAL=3.14f;
final int x;
public Java_Final() {this.x=55;}//final variable can be initialize in constructor
void try_changeFinalVal() {System.out.println("Final Variable Value can not change once it declare");}

final void finalmethod() {	System.out.println("final method");}

 void finalmethod(int x) {System.out.println("final method overload");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
}}//JavaFinal

class ChildClass extends Java_Final{
	/* void finalmethod() {
		System.out.println("can not override final method");
	} */
}
final class FinalClass{
int y=99;	
}
/*class FinalChild extends FinalClass {
	
}*/

