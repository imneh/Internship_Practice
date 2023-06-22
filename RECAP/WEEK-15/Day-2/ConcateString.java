//Write a Java program that accepts two strings as input and concatenates them using the concat() method.
import java.util.Scanner;

class ConcateString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatenatedString = firstString.concat(secondString);
        System.out.println("Concatenated string: " + concatenatedString);

    }
}