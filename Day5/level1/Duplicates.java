import java.util.*;
class Duplicates{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.next();
    int []dp=new int[256];
    String result="";
    for(int i=0;i<str.length();i++){
	if(dp[str.charAt(i)]==0)
	{
	    result+=str.charAt(i);
	}
	dp[str.charAt(i)]++;
    }
	System.out.println("result is "+result);
  }
}