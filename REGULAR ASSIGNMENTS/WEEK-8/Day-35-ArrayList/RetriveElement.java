//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;

public class RetrieveElement {

    public static void main(String[] args) {
        
       
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");
        
       
        String fruit = fruits.get(2);
        
       
        System.out.println("The element at index 2 is: " + fruit);
    }

}