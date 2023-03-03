import java.util.*;
public class Permutation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    System.out.println("Enter the times to rotate");
    int n = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the array elements ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
      for(int i = 0; i < n; i++){    
        int j, last;      
        last = arr[arr.length-1];    
        for(j = arr.length-1; j > 0; j--){     
          arr[j] = arr[j-1];    
        } 
        arr[0] = last;    
      }   
    System.out.println();      
    System.out.println("Array after right rotation: ");   
    for(int i = 0; i< arr.length; i++){ 
      System.out.print(arr[i] + " ");    
        }    
    }    
}