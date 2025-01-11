import java.util.*;

class DisplayFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int maxFactor =10;
		int [] array=new int[maxFactor];
		int index=1,i=0;
		while(index<=number){
			if(number%index==0){
				if(i==maxFactor){
					maxFactor *= 2;
                    			int[] temp = new int[maxFactor];                     						System.arraycopy(array, 0, temp, 0, array.length); 
                    			array = temp;
				}
				array[i]=index;
				i++;
			}
			
			index++;
		}
		System.out.println("Factors of " + number + ":");
        	for (int j = 0; j < i; j++) {
            	System.out.print(array[j] + " ");
        }
	}
}