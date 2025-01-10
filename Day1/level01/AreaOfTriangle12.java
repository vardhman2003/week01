import java.util.*;

class AreaOfTriangle12 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Taking base for calculation
		double base = sc.nextFloat();

		// Taking height for calculation
		double height = sc.nextFloat();

		// Area of Triangle
		double areaOfTriangle = 0.5 * base * height;

		// Printing area of Triangle
		System.out.println("Area of a Triangle is " + areaOfTriangle);
	}
}