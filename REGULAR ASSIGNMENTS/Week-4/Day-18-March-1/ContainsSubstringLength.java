import java.util.*;
class  ContainsSubstringLength{
  static void checkString(String subString,String str1){
    if(str1.contains(subString)){
      System.out.println("valid");
      System.out.println(subString.length());
    }
    else{
      System.out.println("not found");
  }
}
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string 1");
    String str1=sc.nextLine();
    System.out.println("enter substring");
    String subString=sc.nextLine();
    checkString(subString,str1);
  }

}