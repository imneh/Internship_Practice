import java.util.Scanner;
class SumOfDigitOfIntegers{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num,digit,sum=0;
    System.out.println("Enter the number");
    num = sc.nextInt();
    while (num > 0){
      digit = num%10;
      sum = sum + digit;
      num = num/10;
    }
    System.out.println("The sum of Digits is :" +sum);
  }
}