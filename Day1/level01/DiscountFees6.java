class DiscountFees6 {
	public static void main(String[] args) {

		// Initializing student fees.
		int studentFees = 125000;

		// Discount percentage
		int discountPercentage = 10;

		// Calculating Discount Amount
		int discountAmount = (studentFees * discountPercentage) / 100;

		// Calculating Discounted Fees
		int discountedFees = studentFees - discountAmount;

		// Now we are printing current age.
		System.out.println(
				"The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFees);
	}
}
