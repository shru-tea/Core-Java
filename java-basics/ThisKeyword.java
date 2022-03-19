
public class ThisKeyword {
	int x;
	//this points to an object reference, this keyword can be used to refer to object's variables or methods
	ThisKeyword(){
		System.out.println(this);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		new ThisKeyword();
		new ThisKeyword();
	}

}
//can't use this in static block or main method, only in non-static context