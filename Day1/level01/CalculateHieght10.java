import java.util.*;

class CalculateHieght10 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Height in centimeter
		double heightInCm = sc.nextDouble();

		// Convert centimeter in inches
		double inches = heightInCm / 2.54;

		// Convert centimeter in Feet
		double feet = Math.round(inches * 1.0) / 12.0;

		// Printing height in cm, feet and inches.
		System.out.println(
				"Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
	}
}