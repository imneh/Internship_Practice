//Write a Java program to remove a key-value pair from a Map.
import java.util.HashMap;
import java.util.Map;

public class MacroKeyRemove{
    public static void main(String[] args) {
     
        Map<String, Integer> map = new HashMap<>();

  
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        
        String keyToRemove = "banana";
        if (map.containsKey(keyToRemove)) {
            int valueRemoved = map.remove(keyToRemove);
            System.out.println("Removed key-value pair: " + keyToRemove + "=" + valueRemoved);
        } else {
            System.out.println("Key not found in Map: " + keyToRemove);
        }

       
        System.out.println("Map contents after removing key-value pair: " + map);
    }
}
