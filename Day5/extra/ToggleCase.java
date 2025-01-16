import java.util.*;
class ToggleCase{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.next();
    String toggle="";    
    for(int i=0;i<str.length();i++){
	if(str.charAt(i)>=97&&str.charAt(i)<=122)
	    toggle+=(char)(str.charAt(i)-32);
	else
	    toggle+=(char)(str.charAt(i)+32);

    }
    // Displaying Result
    System.out.println("result is "+ toggle);
  }
}