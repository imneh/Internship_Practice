//Write a program that takes a list of integers as input and returns a new list that contains only the odd integers.
import java.util.*;
public class OddIntegers{
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

        List<Integer> oddList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 != 0) {
                oddList.add(num);
            }
        }

        System.out.println("The odd integers in the list are " + oddList);
    }
}