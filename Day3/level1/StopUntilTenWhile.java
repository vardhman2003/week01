import java.util.*;
class StopUntiltenwhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creating Array arr
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;
		while (true) {
			// Taking number from user
			System.out.print("Enter Number" + (index + 1) + " : ");
			arr[index] = sc.nextInt();

			if (arr[index] <= 0)
				break;
			if (index == 9)
				break;
			index++;
		}
		// Printing Result
		for (int i = 0; i < 10; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
}