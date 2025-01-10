import java.util.*;

class ConvertDistance8 {
	public static void main(String[] args) {

		// Distance in Kilometer.
		Scanner km = new Scanner(System.in);
		double kiloMeter = km.nextDouble();

		// Convert Kilometer to Miles
		double miles = kiloMeter / 1.6;

		// Now we are printing distance in miles.
		System.out.println("The total miles is " + miles + " mile for the given " + kiloMeter + " km");
	}
}