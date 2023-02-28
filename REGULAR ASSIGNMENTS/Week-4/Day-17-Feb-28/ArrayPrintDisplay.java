import java.util.Scanner;
class ArrayPrintDisplay{
  //read
 static void read(int size,int arr[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array elements:");
   for(int i=0;i<size;i++){
     arr[i]=sc.nextInt();
   }
 }
  //display
  static void display(int n,int abc[]){
    System.out.println("****Elements****");
    for(int i=0;i<n;i++){
      System.out.println(abc[i]);
    } 
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int a[]=new int[n];
    read(n,a);
    display(n,a);
    
  }
}