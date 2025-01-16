import java.util.*;
class Anagrams{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String strOne=sc.next();
    String strTwo=sc.next();
    int []dpOne=new int[256];
    int []dpTwo=new int[256];
    if(strOne.length()==strTwo.length()){
    for(int i=0;i<strOne.length();i++){
	dpOne[strOne.charAt(i)]++;
	dpTwo[strTwo.charAt(i)]++;
    }
    for(int i=0;i<dpOne.length;i++){
	if(dpOne[i]!=dpTwo[i]){
	    System.out.println("Not a anagram");
	    return;
	}
    }
    System.out.println("Anagram");
    return;
    }
    else
    System.out.println("Not a anagram");
    return;
  }
}