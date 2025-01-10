import java.util.*;

class IntOperation2 {
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input variable one
		int a = sc.nextInt();

		// Input variable two
		int b = sc.nextInt();

		// Input variable three
		int c = sc.nextInt();

		// Calculating Int Operation 1
		int intOperation1 = a + b * c;

		// Calculating Int Operation 2
		int intOperation2 = a * b + c;

		// Calculating Int Operation 3
		int intOperation3 = a / b + c;

		// Calculating Int Operation 4
		int intOperation4 = a % b + c;

		// Printing result
		System.out.println("The following integer operations a + b *c, a * b + c, c + a / b, and a % b + c are "
				+ intOperation1 + ", " + intOperation2 + ", " + intOperation3 + ", " + intOperation4);
	}
}