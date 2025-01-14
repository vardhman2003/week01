import java.util.*;
class RemoveCharacter{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String str=sc.nextLine();
    String arr="";    
    // Taking Input in character
    char ch=sc.next().charAt(0);
    //Calculating for required program
    for(int i=0;i<str.length();i++){
	if(ch==str.charAt(i));
	else
	arr+=str.charAt(i);
    }
    System.out.println("result is "+arr);
  }
}