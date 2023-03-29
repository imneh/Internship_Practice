//Write a program that takes a list of integers as input and returns a new list that contains the first 5 integers in the original list.

import java.util.Scanner;

class FirstFiveIntegers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

       
        System.out.print("Enter a list of integers (one per line, blank line to stop): ");
        String input = scanner.nextLine();
        while (!input.equals("")) {
            int number = Integer.parseInt(input);
            list.add(number);
            input = scanner.nextLine();
        }

       
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < 5 && i < list.size(); i++) {
            newList.add(list.get(i));
        }

      
        System.out.println("New list with first 5 integers: " + newList);
    }
}
