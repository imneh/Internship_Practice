import java.util.Scanner;
class Unique{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array : ");
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("unique elements are : ");
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
      if(count==0){
        System.out.print(arr[i]+" ");
      }
    }
  }

}