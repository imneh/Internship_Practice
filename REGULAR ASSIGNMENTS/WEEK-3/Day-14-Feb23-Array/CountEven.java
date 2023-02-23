import java.util.Scanner;
class CountEven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter the number")
      for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
      }
    int count=0;
    for(int i=0;i<5;i++){
      if(a[i]%2==0){
        count++;
      }
    }
    System.out.println("Print the even numbers"+count);
  }
}