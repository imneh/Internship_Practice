//Write a Java program of swap two elements in an array list.
import java.util.*;
import java.util.Collections;

public class SwapArrayList {

    public static void main(String[] args) {
        
      
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
       
        System.out.println("The original list is:");
        for(Integer num : numbers) {
            System.out.println(num);
        }
        
        
        Collections.swap(numbers, 1, 3);
        
        
        System.out.println("The modified list is:");
        for(Integer num : numbers) {
            System.out.println(num);
        }
    }

}