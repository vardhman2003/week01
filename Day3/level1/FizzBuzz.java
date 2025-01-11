import java.util.*;

class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		// Declare the 1D Array
		String[] arr = new String[number+1];
		for (int i = 0; i <=number; i++) {
			if(i%15==0)
			arr[i]="FizzBuzz";
			else if(i%5==0)
			arr[i]="Buzz";
			else if(i%3==0)
			arr[i]="Fizz";
			else 
			arr[i]=Integer.toString(i);
		}
		// Printing Result
		for (String s : arr) {
            		System.out.println(s);
        	}
	}
}