//Write a Java program to get the size of a Map.
import java.util.*;

public class MacroMapSize{
    public static void main(String[] args) {
       
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 4);
        map.put("grape", 1);

       
        int size = map.size();

        
        System.out.println("The size of the Map is: " + size);
    }
}
