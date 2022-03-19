import java.util.*;
import java.text.*;
public class FoodMenuBillCalculator {

	private static void generateBill(int pizzas, int puffs, int drinks) {
		int pizzaPrize = pizzas * 100;
		int puffPrize = puffs * 20;
		int drinkPrize = drinks *10;
		int total = pizzaPrize+puffPrize+drinkPrize;
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+drinks);
		System.out.println("Total price="+ total);
		System.out.println("ENJOY THE SHOW!!!");
		
	}
	private static void verify(int value) {
		if(value <0) {
			System.out.println(value+" is an incorrect prize");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought: ");
		int pizzas = scanner.nextInt();
		verify(pizzas);
		System.out.println("Enter the no of puffs bought: ");
		int puffs = scanner.nextInt();
		verify(puffs);
		System.out.println("Enter the no of cool drinks bought: ");
		int drinks = scanner.nextInt();
		verify(drinks);
		generateBill(pizzas,puffs,drinks);
	}

}
