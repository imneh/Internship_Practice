import java.util.*;
class FactorsUsingDo{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    int i=1;
    do
    {
     if(n%i==0)
      {
        System.out.println(i);
      }
      i++;
    }while(i<=n/2);
  }
}