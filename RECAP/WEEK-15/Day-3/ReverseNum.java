import java.util.Scanner;
class ReverseNum{
  public static void main(String args[]){
    int num=123;
    int dig=0; int rev=0;
    while(num!=0){
      dig=num%10;
      rev=(rev*10)+dig;
      num=num/10;
    }
    System.out.println(rev);
  }
}