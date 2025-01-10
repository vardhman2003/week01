import java.util.*;

class TemperaturConversio5 {
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input variable celsius
		int fahrenheit = sc.nextInt();

		// Calculating Farenheit Result
		int celsiusResult = (fahrenheit - 32) * 5 / 9;

		// Printing result
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
	}
}