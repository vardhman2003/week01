import java.util.*;

class QuotientRemainder1 {
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input number1
		int number1 = sc.nextInt();

		// Input number 2
		int number2 = sc.nextInt();

		// Calculating quotient
		int qoutient = number1 / number2;

		// Calculating remainder
		int remainder = number1 % number2;

		// Printing qoutient and remainder
		System.out.println("The Quotient is " + qoutient + " and Remainder is " + remainder + " of two number "
				+ number1 + " and " + number2);
	}
}