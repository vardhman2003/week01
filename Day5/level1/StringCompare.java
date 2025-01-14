import java.util.*;
class StringCompare{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    // Taking Input in String
    String strOne=sc.next();
    String strTwo=sc.next();  
    int min=Math.min(strOne.length(),strTwo.length());
    for(int i=0;i<min;i++){
	if(strOne.charAt(i)>strTwo.charAt(i)){
	    System.out.println(strTwo+" comes before "+strOne+" in lexicographical order ");
	    return ;
	}
        else if(strOne.charAt(i)<strTwo.charAt(i)){
	    System.out.println(strOne+" comes before "+strTwo+" in lexicographical order ");
	    return ;
	}
	    
    }
    // Displaying Result
    if(strOne.length()>strTwo.length()){
	    System.out.println(strTwo+" comes before "+strOne+" in lexicographical order ");
	    return ;
	}
        else if(strOne.length()<strTwo.length()){
	    System.out.println(strOne+" comes before "+strTwo+" in lexicographical order ");
	    return ;
	}
  }
}