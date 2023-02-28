import java.util.Scanner;
class SumWithReturn{
  static int sum(){
    int a,b;
    a=10;b=20;
    return a+b;
  }
  public static void main(String args[]){
    int sum=SumWithReturn.sum();
    System.out.println(sum);
  }
}