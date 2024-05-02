package corejava;

public class Java_Beans {
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpName("Ankit");
		obj.setEmpId(100);
		obj.setEmpLocation("Balasore");
		
		System.out.println("Employee Name : " + obj.getEmpName());
		System.out.println("Emplyee id : " + obj.getEmpId());
		System.out.println("Employee Location : " + obj.getEmpLocation());
		
	}
}

class Employee implements java.io.Serializable{
	private String empName;
	private int empId;
	private String empLocation;
	
//	getter methods
//	to return the value getter method is used
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	
//	setter methods
//	To set the value and this is done by the help of this keyword also 
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
}
