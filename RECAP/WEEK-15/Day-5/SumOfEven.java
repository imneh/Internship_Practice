import java.util.Scanner;
class SumofEven{
  public static void main(String args[]){
    int a[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
   }
    System.out.println(" sum of Array Elements");
    for(int i=0;i<5;i++){
        sum=sum+a[i];
      }
    System.out.println(sum);
  }
}