package corejava;

public class Java_EnumDemo {
 Day day;
 public Java_EnumDemo(Day day) {
	 this.day=day;
 }//Constructor
 
 public void tellLikeItIs() {
	 switch(day) {
	 case MONDAY : System.out.println("Its bad ...i dnont want to wakeup early"); break;
	 case TUESDAY: case WEDNESDAY: case THURSDAY: System.out.println("oh ...its meedel days"); break;
	 case SATURDAY: case SUNDAY : System.out.println("Its very Good .... Holiday...."); break;
	 default:System.out.println("Not a Day"); break;
	 }
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Java_EnumDemo obj1=new Java_EnumDemo(Day.MONDAY);
     obj1.tellLikeItIs();
     Java_EnumDemo obj2=new Java_EnumDemo(Day.FRIDAY);
     obj2.tellLikeItIs();
     Java_EnumDemo obj3=new Java_EnumDemo(Day.SUNDAY);
     obj3.tellLikeItIs();
	}

}