import java.util.StringTokenizer;
class CountNumTokens{
  public static void main(String args[]){
    StringTokenizer st=new StringTokenizer("hello there who are you");
    int count=0;
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
      count++;
    }
      System.out.println("the number of tokens are "+count);
  }
}

//import java.util.StringTokenizer;
//class CountToken{
  //public static void main(String args[]){
    //StringTokenizer s=new StringTokenizer("welcome to  bitlabs");
     //System.out.println("number of tokens is"+s.countTokens());
      //}
  //}