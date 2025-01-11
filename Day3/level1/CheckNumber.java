import java.util.*;

class CheckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking age from user
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Number" + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		// Printing Result
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0)
				System.out.println("Negative Number ");
			else {
				System.out.print("Positive Number ");
				if (arr[i] % 2 == 0)
					System.out.println("and Number is Even");
				else
					System.out.println("and Number is Odd");
			}

		}
	}
}