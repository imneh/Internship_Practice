import java.util.*;
public class LongestWord{
  static String longest(String str){
    String a[]=str.split(" ");
    int max=a[0].length();
    String longst="";
    for(int i=0;i<a.length;i++){
      if(a[i].length()>max){
        max=a[i].length();
        longst=a[i];
      }  
    }
    return longst;
  }
  public static void main(String args[]){
    Sring str="Hi hello good Morning";
    String a=LongestWord.longest(str);
    System.out.println(a);
  }
}