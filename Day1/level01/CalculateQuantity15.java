import java.util.*;

class CalculateQuantity15 {
	public static void main(String[] args) {

		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input Unit Price
		double unitPrice = sc.nextDouble();

		// Input Quantity
		double quantity = sc.nextDouble();

		// Calculate total Quantity
		double totalPurchase = unitPrice * quantity;

		// Printing total quantity, quantity and unit price
		System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity " + quantity
				+ " and unit price is INR " + unitPrice);
	}

}