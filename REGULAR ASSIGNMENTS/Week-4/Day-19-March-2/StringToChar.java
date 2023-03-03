import java.util.Scanner;
class StringToChar{
  static void tocharArrayMethod(String s){
  char a[]=s.toCharArray();
  for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
  }
}
  public static void main(String args[]){
    tocharArrayMethod("nehaa");
  }
}