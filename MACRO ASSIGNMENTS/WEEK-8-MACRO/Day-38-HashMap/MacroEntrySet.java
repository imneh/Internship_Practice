//Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method
import java.util.HashMap;
import java.util.Map;

public class MacroEntrySet{
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

    
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

      
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
