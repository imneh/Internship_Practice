//Write a program that takes a list of integers as input and returns the largest integer in the list.
import java.util.*;
class LargestInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        int max = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("The largest integer in the list is " + max);
    }
}