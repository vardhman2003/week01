import java.util.*;

class MaxHandshake16 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input Number Of Students
		int numberOfStudents = sc.nextInt();

		// Calculate Max possible
		int maxPossible = (numberOfStudents * (numberOfStudents - 1)) / 2;

		// Printing max possible handshake
		System.out.println("The total possible handshakes " + maxPossible);
	}
}