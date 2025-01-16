import java.util.*;
class MostFrequent{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.nextLine();
    int []dp=new int[256];
    int maxCount=0;
    char ch=' ';
    for(int i=0;i<str.length();i++){
	dp[str.charAt(i)]++;
    }
    for(int i=0;i<dp.length;i++){
	if(dp[i]>maxCount){
	maxCount=dp[i];	
	ch=(char)i;
        }
    }
    
	System.out.println("result is "+ch);
  }
}