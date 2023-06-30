
//WAP to count total number of duplicate elements in an array
import java.util.Scanner;

class Duplicate {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = new int[5];
    int count = 0;
    System.out.println("Enter array elements:");
    for (int i = 0; i < 5; i++) {
      arr[i] = s.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          break;
        }
      }
    }
    System.out.println("No. of duplicate elements are:" + count);
  }
}