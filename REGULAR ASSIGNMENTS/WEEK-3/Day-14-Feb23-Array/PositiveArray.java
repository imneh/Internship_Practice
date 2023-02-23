import java.util.Scanner;
class PositiveArray{
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }  
    System.out.println("Positive elements are");
    for(int i=0;i<5;i++){
      if(arr[i]>0){
        System.out.println(arr[i]);
      }
  }
 }
}
