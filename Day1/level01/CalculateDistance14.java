import java.util.*;

class CalculateDistance14 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Distance in feet provided by user
		double distanceInFeet = sc.nextDouble();

		// Convert feet in miles
		double miles = distanceInFeet / (1760.0 * 3.0);

		// Convert Feet in yards
		double yards = distanceInFeet / 3.0;

		// Printing distance of miles and yards.
		System.out.println("The distance in yards is " + yards + " and miles is " + miles
				+ " for the distance provided by user is " + distanceInFeet);
	}
}