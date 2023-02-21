import java.util.Scanner;
class WhileSumofOdd{
  public static void main(String args[]){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value")
    n=sc.nextInt();
    int i=1;
      while(i<=n){
      i=i+2
      sum=sum+i;
      }
    System.out.println(sum);
  }
  
}