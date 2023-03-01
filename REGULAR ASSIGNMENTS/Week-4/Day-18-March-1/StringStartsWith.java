import java.util.*;
class StringStartsWIth{
  static void validateString(String str1){
    if(str1.startsWith("n") && str1.endsWith(".com"))
    {
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
  }
  
public static void main(String args[]){
      validateString("nehashiv2002@gmail.com");
    
  }
}