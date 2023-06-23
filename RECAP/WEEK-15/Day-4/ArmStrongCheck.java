 //sum of its own digits each raised to the power of the number of digits.
import java.util.Scanner;
class ArmStrongCheck{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    int remainder=0,result=0;
    int originalNumber=n;
    while(n!=0){
      remainder=n%10;
      result=result+((int)Math.pow(remainder,3);
      n=n/10;
    }
    if(originalNumber==result){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not Armstrong number");
    }
  }
}

//153  1^3 + 5^3 + 3^3 = 1 + 125 + 27 =153------Arm Strong number
 // 1234 1^4 + 2^4 + 3^4 + 4^4 = 1 + 16 +81 +256 = 354-----Not an Arm Strong number