//Write a Java program to iterate over the values of a Map using the values() method.//
import java.util.HashMap;
import java.util.Map;

public class MacroIterateValue{
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

    
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

      
        for (int value : map.values()) {
            System.out.println(value);
        }
    }
}
