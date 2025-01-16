import java.util.*;
class CountAlpha{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int countVowel=0;
    int countConsonant=0;
    String str=sc.next();
    for(int i=0;i<str.length();i++){
	if(str.charAt(i)=='U'||str.charAt(i)=='u'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='A'||str.charAt(i)=='a')
	countVowel++;
        else
	countConsonant++;
    }
    System.out.println("Vowels are : "+countVowel+"\n"+"Consonant are : "+countConsonant);

  }
}