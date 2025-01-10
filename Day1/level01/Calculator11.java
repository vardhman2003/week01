import java.util.*;

class Calculator11 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Taking number 1 for calculation
		float input1 = sc.nextFloat();

		// Taking number 2 for calculation
		float input2 = sc.nextFloat();

		// Addition
		float add = input1 + input2;

		// Subtraction
		float sub = input1 - input2;

		// Multiplication
		float mul = input1 * input2;

		// Division
		float div = input1 / input2;

		// Printing addition, subtraction, multiplication and division value of 2
		// numbers
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + input1
				+ " and " + input2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
	}
}