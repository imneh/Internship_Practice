//sequence of numbers such that every third number is equal to the sum of the previous two numbers. For Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
import java.util.Scanner;
public class FibonacciSum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 0, num2 = 1, sum, count = 0;
        System.out.println("Enter nth term");
        int nterm = s.nextInt();

        System.out.println(num1);
        while (count <= nterm) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);
            count++;
        }
    }
}