//Write a JAVA program to count total number of even and odd elements in an array.

public class CountEvenOdd{
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 6};
        int evenCount = 0, oddCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total even elements in the array: " + evenCount);
        System.out.println("Total odd elements in the array: " + oddCount);
    }
}
