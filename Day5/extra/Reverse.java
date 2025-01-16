import java.util.*;
class Reverse{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char []charArray=str.toCharArray();
    for(int i=0;i<str.length()/2;i++){
	char temp = charArray[i];
        charArray[i] = charArray[charArray.length - i - 1];
        charArray[charArray.length - i - 1] = temp;
    }
    String reversedStr = new String(charArray);
    System.out.println("Reverse string : "+reversedStr);
  }
}