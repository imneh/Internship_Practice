import java.util.Scanner;
class StringSplit{
  static void splitMethod(String s){
    String word[]=s.split(" ");
    for(int i=0;i<word.length;i++){
      System.out.println(word[i]);
    }
  }
  public static void main(String args[]){
    splitMethod("welcome to bitlabs");
  }
}