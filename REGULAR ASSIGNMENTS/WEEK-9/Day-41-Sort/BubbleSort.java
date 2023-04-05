import java.util.Arrays;
import java.util.*;

public class BubbleSort{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
     int a[] = new int[n];
    System.out.println("Enter the array elements");
        int n = a.length;
        int temp=0;
    for(int i=0; i<a.length-1; i++){
      for(int j=0; j<a.length-i-1; j++){
            if(a[j]>a[j+1]){
        temp=a[j];
        a[j]=a[j+1];
             
        a[j+1]=temp;
        }
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
    }
  }
    }
  }