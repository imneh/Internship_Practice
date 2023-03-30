//Write a Java program to check if a particular key is present in a Map
import java.util.HashMap;
import java.util.Map;

public class MacroKeyCheck {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

        
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

       
        String keyToCheck = "banana";
        if (map.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the Map");
        } else {
            System.out.println(keyToCheck + " is not present in the Map");
        }
    }
}
