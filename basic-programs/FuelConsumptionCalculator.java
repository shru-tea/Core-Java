import java.util.*;
import java.text.*;
public class FuelConsumptionCalculator {
	
	//display in format of liters/100km
	private static void calculateFuelConsumption(double litre, double distance) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		double miles = distance*0.6214;
		double gallon = litre*0.2642;
		double litreperkm = (litre/distance)*100;
		double milespergallon = miles/gallon;
		System.out.println("Litres/100KM");
		System.out.println(decimalFormat.format(litreperkm));
		System.out.println("Miles/Gallon");
		System.out.println(decimalFormat.format(milespergallon));
	}

	private static void verify(double unit) {
		if(unit <= 0) {
			System.out.println((int) unit + " is an invalid input");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of litres to fill the tank: ");
		double litre = scanner.nextDouble();
		verify(litre);
		System.out.println("Enter the distance covered: ");
		double distance = scanner.nextDouble();
		verify(distance);
		calculateFuelConsumption(litre,distance);
	}

}
