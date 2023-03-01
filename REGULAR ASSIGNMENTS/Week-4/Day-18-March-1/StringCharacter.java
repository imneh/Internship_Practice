import java.util.Scanner;
class StringCharacter{
  static void getCharacter(String str){
    System.out.println(str.charAt(1));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String str1=sc.next();
    getCharacter(str1);
  }
  }
