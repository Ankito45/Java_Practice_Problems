package corejava;

public class Java_Blocks {
	static {
		System.out.println("It's Static Block1");
	}
	{System.out.println("It's Instance Block");}
	public static void main(String[] args) {  
		System.out.println("helloo Sysout1...");
		{System.out.println("It's Instance Block2");}
		Java_Blocks obj = new Java_Blocks();
		System.out.println("Hello sysout2....");
	}
	static {
		System.out.println("It's Static Block2");
	}
	{System.out.println("It's Instance Block3");}
}
