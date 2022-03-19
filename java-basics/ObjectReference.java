
public class ObjectReference {
	
	//creating object inside a static block
	static {
		System.out.println("inside static block");
		ObjectReference ord = new ObjectReference();
		System.out.println(ord); //prints the address of the object created
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
}
