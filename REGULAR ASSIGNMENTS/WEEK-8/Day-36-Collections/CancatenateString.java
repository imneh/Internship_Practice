
//Write a program that takes a list of strings as input and returns the concatenated string of all the elements in the list

import java.util.Scanner;

class ConcatenateStrings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    System.out.print("Enter a list of strings (one per line, blank line to stop): ");
    String str = scanner.nextLine();
    while (!str.equals("")) {
      list.add(str);
      str = scanner.nextLine();
    }

    String result = "";
    for (int i = 0; i < list.size(); i++) {
      result += list.get(i);
    }

    System.out.println("Concatenated string: " + result);
  }
}