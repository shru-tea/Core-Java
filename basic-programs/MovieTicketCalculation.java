import java.util.*;
public class MovieTicketCalculation {
	
	private static void calculateTicket(int noOfTickets,char refreshment,char coupon,char circle) {
		float totalPrice=0;
		if((int)circle == 107) {
			System.out.println("calculating for king seats");
			totalPrice = (float)totalPrice+(noOfTickets*75);
			System.out.println(totalPrice);
		}
		if((int)circle == 113) {
			System.out.println("calculating for queen seats");
			totalPrice = totalPrice+(noOfTickets*150);
			System.out.println(totalPrice);
		}
		if(noOfTickets>=20) {
			System.out.println("calculating for discount on more than 20 seats");
			totalPrice = (float) (totalPrice-(0.10*totalPrice));
			System.out.println(totalPrice);
		}
		if((int)coupon == 121) {
			System.out.println("discount for coupon");
			totalPrice = (float) ((float) totalPrice - (0.02*totalPrice));
			System.out.println(totalPrice);
		}
		if((int) refreshment == 121) {
			System.out.println("adding price for refreshments");
			totalPrice = (float) totalPrice+(noOfTickets*50);
			System.out.println(totalPrice);
		}
		System.out.println("Ticket cost:"+totalPrice);
		
	}

	private static void verify(int noOfTickets, char circle) {
		if(noOfTickets<5 || noOfTickets>40) {
			System.out.println("Minimum of 5 and Maximum of 40 tickets");
		}
		if((int)circle !=107 || (int)circle != 113) {
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of tickets: ");
		int noOfTickets = scanner.nextInt();
		System.out.println("Do you want refreshment: ");
		//how to input a character in java
		char refreshment = scanner.next().charAt(0);
		System.out.println("Do you have coupon code: ");
		char coupon = scanner.next().charAt(0);
		System.out.println((int)coupon);
		System.out.println("Enter the circle: ");
		char circle = scanner.next().charAt(0);
		System.out.println((int) circle);
		verify(noOfTickets,circle);
		calculateTicket(noOfTickets,refreshment,coupon,circle);
	}

}
