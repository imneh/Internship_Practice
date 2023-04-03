import java.util.ArrayList;

public class PracticeSearch{
    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<Object>();
        
        
        list.add("hello");
        list.add(10);
        list.add(3.14);
        list.add(true);
        list.add('a');
        
        
        Object searchElement = "hello";
        if (list.contains(searchElement)) {
            System.out.println("The ArrayList contains " + searchElement);
        } else {
            System.out.println("The ArrayList does not contain " + searchElement);
        }
    }
}