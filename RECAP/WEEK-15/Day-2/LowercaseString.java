//Write a Java program that takes a string as input and converts it to lowercase using predefined methods.
import java.util.Scanner;

public class LowercaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowercaseString = inputString.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

    }
}
