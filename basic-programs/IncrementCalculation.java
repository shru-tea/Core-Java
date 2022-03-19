import java.util.*;
public class IncrementCalculation {

	private static void calculateIncrement(double salary,float rating) {
		double finalSalary=0;
		if(rating>=1 && rating<=3) {
			finalSalary = salary + (0.10*salary);
		}
		if(rating>=3.1 && rating<=4) {
			finalSalary = salary + (0.25*salary);
		}
		if(rating>=4.1 && rating<=5) {
			finalSalary = salary + (0.30*salary);
		}
		System.out.println("The new final salary after appraisal: "+ finalSalary);
	}
	private static void verify(double salary,float rating) {
		if(salary<=0 || (rating<=1 || rating>=5)) {
			System.out.println("Invalid input");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		double salary = scanner.nextDouble();
		System.out.println("Enter the Performance appraisal rating: ");
		float rating = scanner.nextFloat();
		verify(salary,rating);
		calculateIncrement(salary,rating);
	}

}
