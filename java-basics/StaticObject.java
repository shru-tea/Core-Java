
public class StaticObject {
	//static variable = object declaration
	static StaticObject obj;
	static StaticObject ord;
	
	static {
		System.out.println("object created : "+ obj);
		//Definition
		obj = new StaticObject();
		init();
	}
	
	public static void main(String[] args) {
		System.out.println("object address : "+obj);
	}
	
	//object reference inside a static method
	static void init() {
		ord = new StaticObject();
		System.out.println("inside static method");
		System.out.println("New object: "+ ord);
	}
}
