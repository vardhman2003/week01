import java.util.*;
class Palindrome{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.next();
    int i=0;
    for(int j=str.length()-1;i<str.length()/2;i++,j--){
	if(str.charAt(i)!=str.charAt(j)){
	    // String is not a palindrome
	    System.out.println("Not a Palindrome");
	    break;
	}
	
    }
    // String is Palindrome
    if(i==str.length()/2)
	System.out.println("Palindrome");
  }
}