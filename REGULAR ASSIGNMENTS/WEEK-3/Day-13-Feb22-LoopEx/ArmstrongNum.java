import java.util.Scanner;
class ArmStrongNum{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    system.out.println("Enter n value");
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