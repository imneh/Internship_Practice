import java.util.StringTokenizer;
class reverse{
  public static void main(String args[]){
    String s ="Bitlabs Batch2";
    StringTokenizer st = new StringTokenizer(s);
 
    String sReversed = "";
 
    while(st.hasMoreTokens()){
      sReversed=st.nextToken()+" "+sReversed;
      
    }
    System.out.println("Original string is :" +s);
    System.out.println("Reversed string is :" +sReversed);
  }
}