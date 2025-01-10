import java.util.*;

class FindFee9 {
	public static void main(String[] args) {

		// Taking Fee as a input
		Scanner fee = new Scanner(System.in);
		int fees = fee.nextInt();
		int discountPercentage = fee.nextInt();

		// Discount Amount as follow
		int discountAmount = (fees * discountPercentage) / 100;

		// Discounted fees as follow
		int discountedFees = fees - discountAmount;

		// Printing discount amount and final discounted fee.
		System.out.println(
				"The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFees);

	}
}