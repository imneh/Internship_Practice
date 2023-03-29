//Write a program that takes a list of integers as input and returns a new list that contains the squares of all the integers in the original list.
import java.util.*;
class SquareIntegers{
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

        List<Integer> squareList = new ArrayList<>();
        for (int num : list) {
            int square = num * num;
            squareList.add(square);
        }

        System.out.println("The squares of the integers in the list are " + squareList);
    }
}