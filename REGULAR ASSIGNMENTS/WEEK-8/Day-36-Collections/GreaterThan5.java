//Write a program that takes a list of strings as input and returns a new list that contains only the strings that have length greater than 5.
import java.util.*;


public class StringsGreaterThan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

       
        System.out.print("Enter a list of strings (one per line, blank line to stop): ");
        String str = scanner.nextLine();
        while (!str.equals("")) {
            list.add(str);
            str = scanner.nextLine();
        }

        
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 5) {
                newList.add(list.get(i));
            }
        }

      
        System.out.println("New list with strings greater than length 5: " + newList);
    }
}
