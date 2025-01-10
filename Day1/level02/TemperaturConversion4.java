import java.util.*;

class TemperaturConversion4 {
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Input variable celsius
		int celsius = sc.nextInt();

		// Calculating Farenheit Result
		int farenheitResult = (celsius * 9 / 5) + 32;

		// Printing result
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
	}
}