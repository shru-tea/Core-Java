package eclipsetest;

public class StaticMethod {
	public static void main(String[] args) {
		System.out.println("Inside main method");
		method1();
	}
	//static method
	static void method1() {
		System.out.println("inside static method 1");
	}
	
	//static method being called from within static block
	static {
		System.out.println("Inside static block");
		method1();
	}
}

//static methods are part of a class and not instance of the class
//since static methods are part of a class, you don't need to call the class first

