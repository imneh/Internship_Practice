//Write a Java program to remove the third element from a array list

import java.util.*;

public class RemoveThirdElement {

    public static void main(String[] args) {
        
       
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");
        
        
        fruits.remove(2);
        
       
        System.out.println(fruits);
    }

}




