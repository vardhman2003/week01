import java.util.*;

class CheckNumberNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number < 1)
			System.out.println("Error ");
		else {
			int size = number / 2 + 1;
			int[] evenNumbers = new int[size];
			int[] oddNumbers = new int[size];
			int even = 0, odd = 0;
			for (int i = 0; i < number; i++) {
				if (i % 2 == 0) {
					evenNumbers[even] = i;
					even++;
				} else {
					oddNumbers[odd] = i;
					odd++;
				}
			}
			// Printing Result
			System.out.println("Even numbers:");
			for (int i = 0; i < even; i++) {
				System.out.print(evenNumbers[i] + " ");
			}
			System.out.println("\nOdd numbers:");
			for (int i = 0; i < odd; i++) {
				System.out.print(oddNumbers[i] + " ");
			}
		}
	}
}
