package eclipsetest;
//static block and static variables are interchangeable, whichever comes first is executed first.
public class StaticVariables {
	
	//all global variables(static or not) are given a default value of 0
	//static variable
	static int num=method1();
	
	//static block
	static {
		System.out.println("inside static block");
	}
	//static method
	static int method1() {
		System.out.println("inside static method");
		return 20;
	}
	//main method
	public static void main(String[] args) {
		System.out.println("value of nume = "+num);
		System.out.println("inside main method");
	}
}
