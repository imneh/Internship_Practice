/*Write a program that prompts the user to enter an email address. The program should validate the email address based on the following criteria:
The email address must contain the "@" symbol.
The email address must contain a domain name (e.g., "example.com").*/
import java.util.Scanner;
public class EmailValidate{
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter an email address: ");
  String email = s.nextLine();
    if (validateEmail(email)) {
      System.out.println("Valid email address!");
    }
    else{
      System.out.println("Invalid email address!");
    }
  }
  public static boolean validateEmail(String email) {
    if (email.contains("@") && email.endsWith(".com")) {
        return true;
      }
    return false;
    }
}