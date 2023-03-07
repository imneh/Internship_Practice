import java.util.StringTokenizer;
class MaxLength{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("Hello Bitlabs");
    int maxLength=0;
    while(s.hasMoreTokens()){
      String token=s.nextToken();
      int length=token.length();
      if(length>maxLength){
        maxLength=length;
      }
    } 
    System.out.println("The maximum token length is:" +maxLength);
  }
}