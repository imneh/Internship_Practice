import java.util.Scanner;
class Search{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int  n=sc.nextInt();
    int arr[]={1,2,3,4,5};
    System.out.println("enter the element to be searched");
    int searchElement=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==searchElement){
        System.out.println("element found"+arr[i]);
      }
     
    }
  }
}