import java.util.*;

class DoubleOpt3 {
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input variable one
		double a = sc.nextDouble();

		// Input variable two
		double b = sc.nextDouble();

		// Input variable three
		double c = sc.nextDouble();

		// Calculating Int Operation 1
		double doubleOpt1 = a + b * c;

		// Calculating Int Operation 2
		double doubleOpt2 = a * b + c;

		// Calculating Int Operation 3
		double doubleOpt3 = a / b + c;

		// Calculating Int Operation 4
		double doubleOpt4 = a % b + c;

		// Printing result
		System.out.println("The following integer operations a + b *c, a * b + c, c + a / b, and a % b + c are "
				+ doubleOpt1 + ", " + doubleOpt2 + ", " + doubleOpt3 + ", " + doubleOpt3);
	}
}