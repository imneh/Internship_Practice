 //product of all positive descending integers. Factorial of n is denoted by n!. For example: 4! = 4*3*2*1 = 24.
import java.util.Scanner;
class FactorialofNum{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=i*fact;
    }
     System.out.println(fact); 
  }
}