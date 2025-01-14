import java.util.*;
class SubStringOccurence{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.nextLine();
    String subStr=sc.next();
    int count=0;
    // Declaring String 
    for(int i=0;i<=str.length()-subStr.length();i++){
	int k=i;
	int j = 0;
	for( ;j<subStr.length();j++,k++){
		if(str.charAt(k)!=subStr.charAt(j))
		{
		    break;  
          	}
        }
	if (j == subStr.length())
		count++;	
    }
    // Displaying Result
    System.out.println("result is "+ count);
  }
}