import java.util.*;

class MeanHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creating Array arr
		double[] arr = new double[11];

		double total = 0.0;

		for (int index = 0; index < 11; index++) {
			// Taking number from user
			System.out.print("Enter Number" + (index + 1) + " : ");
			arr[index] = sc.nextInt();
			total += arr[index];
		}

		// Calculating
		double mean = total / 11;

		// Prining Mean Height
		System.out.println(mean);
	}
}