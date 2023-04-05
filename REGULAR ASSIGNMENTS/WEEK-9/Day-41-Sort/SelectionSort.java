import java.util.Scanner;
import java.util.Arrays;
class SelectionSort{
  public static void main(String args[]){
    int arr[]={2,5,67,23,45,13,2,7};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
         int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
        }
        
      }
      System.out.print(arr[i]+"  ");
    }
  }
}