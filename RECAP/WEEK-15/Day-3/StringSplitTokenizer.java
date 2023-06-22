import java.util.*;
class StringSplitTokenizer{
  public static void main(String args[]){
    String str="Hello ,World How are you";
    StringTokenizer tokenizer=new StringTokenizer(str);
      int wordCount = tokenizer.countTokens();
        System.out.println("Number of words: " + wordCount);       
        while(tokenizer.hasMoreTokens()){
        System.out.println(tokenizer.nextToken());
    }
  }
}