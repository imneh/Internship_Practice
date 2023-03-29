//Write a Java program to sort a given array list

import java.util.*;
public class SortArrayList {
   public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        
       
        Collections.sort(numbers);
        
    
        System.out.println(numbers);
    }

}