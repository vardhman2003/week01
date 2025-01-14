import java.util.*;
class LongestWord{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.nextLine();
    // Declaring String 
    String maxWord="";
    String currWord="";
    for(int i=0;i<str.length();i++){
	if(str.charAt(i)==' ')
	{
	    if(currWord.length()>maxWord.length())
		maxWord=currWord;
            currWord="";
	}
	else{
	    currWord+=str.charAt(i);
	}
    }
    if(currWord.length()>maxWord.length())
	maxWord=currWord;
    // Displaying Result
    System.out.println("result is "+maxWord);
  }
}