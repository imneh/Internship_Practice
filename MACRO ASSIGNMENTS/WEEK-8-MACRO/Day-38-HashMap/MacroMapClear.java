//Write a Java program to clear all the key-value pairs of a Map.Write a Java program to copy all the key-value pairs of one Map to another Map.
import java.util.*;
class MacroMapClear{
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 4);
        map.put("grape", 1);

        
        map.clear();

        
        System.out.println("The Map after clearing all key-value pairs: " + map);
    }
}
