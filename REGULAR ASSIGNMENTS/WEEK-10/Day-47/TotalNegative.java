//Write a JAVA program to count total number of negative
public class TotalNegative {
    public static void main(String[] args) {
        int arr[] = { -16, 0, -6, 8, 10, -2 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}