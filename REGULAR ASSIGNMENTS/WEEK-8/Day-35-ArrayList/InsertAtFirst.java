import java.util.*;

public class InsertAtFirst {

    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        
        // Insert an element at the first position
        numbers.add(0, 1);
        
        // Print the ArrayList
        System.out.println(numbers);
    }

}