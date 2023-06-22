
import java.util.*;

public class StringCount{

  public static void main(String args[]){

    Scanner s=new Scanner (System.in);

    System.out.println("enter the String");

    String str=s.nextLine();

    int alphabet =0;

    int digits=0;

    int splchar=0;


    for(int i=0;i<str.length();i++){


      char c[]=str.toCharArray();

      if(c[i]>='a' && c[i]<='z'  || c[i]>='A' &&  c[i]<='Z'){

        alphabet++;

      }

      else if(c[i]>='0' && c[i]<='9'){

        digits++;

      }

      else {

        splchar++;

      }


}

    System.out.println("the alphabet count is " +alphabet);

    System.out.println("the digits count is" +digits);

    System.out.println("the special character " +splchar);

  }

}