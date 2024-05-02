package corejava;

public class InsidePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_AcessModifier obj=new Java_AcessModifier();
		System.out.println("Public Access : "+obj.publicVar);
		System.out.println("Protected Access : "+obj.protectedVar);
		//System.out.println("Private Access : "+obj.privateVar);
		System.out.println("Default Access : "+obj.defaultVar);

	}

}