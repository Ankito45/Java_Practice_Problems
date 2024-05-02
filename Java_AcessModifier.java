package corejava;
/*
 * -----------------------------------------------------------------------
 * -----------------------------------------------------------------------
 * 		Modifier		class	  Package		subClass 	Project
 * 		--------------------------------------------------------------
 *      public			Yes			Yes			Yes 		Yes
 *      protected		yes			yes			Yes			NO
 *      private			yes			NO			NO			NO
 *      default			yes			yes			NO			NO
 * 
 * 
 */
public class Java_AcessModifier {
	public int publicVar=10;//public
	protected int protectedVar=20;//protected
	private int privateVar=30; //private
	int defaultVar=40; //default

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_AcessModifier obj=new Java_AcessModifier();
		System.out.println("Within class access all Access-Modifiers : "+obj.publicVar+" "+obj.privateVar+" "+obj.protectedVar+" "+obj.defaultVar);

	}

}