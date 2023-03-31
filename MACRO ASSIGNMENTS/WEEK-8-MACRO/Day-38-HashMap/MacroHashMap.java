//Write a Java program to create a HashMap and add key-value pairs to it.
import java.util.HashMap;

public class MacroHashMap{
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();

      
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);

        
        System.out.println(hashMap);
    }
}
