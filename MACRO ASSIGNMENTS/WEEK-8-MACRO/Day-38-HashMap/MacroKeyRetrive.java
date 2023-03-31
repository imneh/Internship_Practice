//Write a Java program to retrieve a value from a Map using its key
import java.util.HashMap;
import java.util.Map;

public class MacroKeyRetrive{
    public static void main(String[] args) {
      
        Map<String, Integer> map = new HashMap<>();

      
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

      
        String keyToRetrieve = "banana";
        if (map.containsKey(keyToRetrieve)) {
            int valueRetrieved = map.get(keyToRetrieve);
            System.out.println("Value retrieved for key " + keyToRetrieve + ": " + valueRetrieved);
        } else {
            System.out.println("Key not found in Map: " + keyToRetrieve);
        }
    }
}
