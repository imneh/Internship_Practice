import java.util.*;
class SumOfFirstLast{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num, sum=0;
    int FirstDigit =0;
    int LastDigit = 0;
    System.out.println("Enter the number");
    num = sc.nextInt();
    LastDigit=num%10;
    System.out.println("Last digit is :" +LastDigit);
    while(num>10){ 
      num = num/10;
      FirstDigit = num;
      sum = LastDigit + FirstDigit;
       System.out.println("First didgit is :" +FirstDigit);
    }
   
    System.out.println("Sum of First and Last digit is :" +sum);
  }
  
}