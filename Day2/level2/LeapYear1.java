import java.util.*;
class LeapYear1{
public static void main(String[] args){
	
	// Scanner Class
	Scanner sc=new Scanner(System.in);

	// Input Year
	int year=sc.nextInt();

	// Check leap year and print
	if (year % 4 == 0) { 
            if (year % 100 == 0) { 
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } 
		else {
                    System.out.println(year + " is not a leap year.");
                }
            } 
	    else {
                System.out.println(year + " is a leap year.");
            }
        } 
	else {
            System.out.println(year + " is not a leap year.");
        }
}
}