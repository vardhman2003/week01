class CalculateCost4 {
	public static void main(String[] args) {

		// We have cost price and selling price.
		int costPrice = 129, sellingPrice = 191;

		// Calculating profit
		int profit = sellingPrice - costPrice;

		// Calculating profit percentage
		int pofitPercentage = (profit / costPrice) * 100;

		// Printing cost price and selling price
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);

		// Printing profit and profit percentage
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + pofitPercentage);
	}
}