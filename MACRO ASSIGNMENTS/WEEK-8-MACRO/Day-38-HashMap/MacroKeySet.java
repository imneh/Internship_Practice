//Write a Java program to iterate over the key-value pairs of a Map using the keySet()method//
import java.util.*;
public class MacroKeySet{
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 4);
        map.put("grape", 1);

       
        for (String key : map.keySet()) {
            
            int value = map.get(key);

          
            System.out.println(key + " = " + value);
        }
    }
}
