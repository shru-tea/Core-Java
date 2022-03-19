//static block and main method are executed only once whereas non static block and constructor are executed as many times as pbject of the class is created
public class NonStaticMembers {
	//non-static variable
	int num;
	
	//constructor
	NonStaticMembers(){
		System.out.println("inside the constructor");
	}
	
	//non-static block--> gets called before the constructor gets called, as soon as object of a class is
	//created, non static block will be executed by the JVM and then the constructor
	{
		System.out.println("inside the non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("inside the main method");
		//to invoke non-static methods we use the object reference
		NonStaticMembers obj = new NonStaticMembers();
		obj.doSomething();
	}
	
	static {
		System.out.println("inside the static block");
		new NonStaticMembers();
	}
	
	//non static method --> invoking a non static method
	void doSomething() {
		System.out.println("inside non static method");
	}
}
