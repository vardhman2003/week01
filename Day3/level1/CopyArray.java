import java.util.*;

class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int index=0;
		// Declare the 2D Array
		int[][] array = new int[rows][columns];
		// Declare the 1D Array
		int[] arr = new int[rows * columns];
		System.out.println("Enter the elements of the 2D Array: ");
		for (int i = 0; i <rows; i++) {
			for(int j=0;j<columns;j++){
				array[i][j] = sc.nextInt();
				arr[index]=array[i][j];
				index++;
			}
		}
		// Printing Result
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}