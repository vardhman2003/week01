import java.util.*;
class VoteEligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking age from user
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter age of Student " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		// Printing Result
		for (int i = 0; i < 10; i++) {
			if (arr[i] < 0)
				System.out.println("Invalid Input");
			else if (arr[i] >= 18)
				System.out.println("Student is Eligible to vote of age " + arr[i]);
			else
				System.out.println("Student is Not Eligible to vote of age " + arr[i]);
		}
	}
}