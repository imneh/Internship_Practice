import java.util.*;
class FirstLastDigit{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    int FirstDigit =0;
    int LastDigit = 0;
    System.out.println("Enter the number");
    num = sc.nextInt();
      LastDigit=num%10;
    System.out.println("Last digit is :" +LastDigit);
    while(num>10){
      num = num/10;
    }
    FirstDigit = num;
    System.out.println("First digit is :" +FirstDigit);
  }
}