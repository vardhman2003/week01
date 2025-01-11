import java.util.*;

class PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking number from user
		int number = sc.nextInt();

		// Printing Table
		for (int i = 1; i <= 10; i++) {
			System.out.println((number) + "X" + (i) + "=" + i * number);
		}
	}
}