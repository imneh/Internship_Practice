//import java.util.Scanner;
//class StringFormat{
 // public static void main(String[] args) {
   // String str = "Neha";
    // format string 
    //String formatStr = String.format("Student: %s", str);
    //System.out.println(formatStr);
 // }
//}

import java.util.Scanner;
class StringFormat{
  public static void main(String args[]){
    float n1=11.11f,n2=672.57f;
    float result=n1*n2;
    String result1=String.format("%-20.2f%-20.2f%-20.2f",result,result,result);
    System.out.println(result1);
    String result2=String.format("%-20.2f%-20.2f%-20.2f",result,result,result);
    System.out.println(result2);
  }
}