import java.util.*;
class ReplaceWord{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    // Declaring String 
    String str=sc.nextLine();
    String strNew="";
    String replaceWord= sc.nextLine();
    String currWord= sc.nextLine();
    for(String word:str.split(" ")){
	if(word.equals(currWord))
	    strNew+=replaceWord+" ";
	else
	    strNew+=word+" ";
    }
     // Displaying Result
    System.out.println("result is "+strNew);
  }
}