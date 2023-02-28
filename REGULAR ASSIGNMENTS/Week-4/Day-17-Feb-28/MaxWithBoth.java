import java.util.Scanner;
class MaxWithBoth{
  static int maxNumber(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    int max= MaxWithBoth.maxNumber(12, 45);
    System.out.println(max);
  
  }
}