//Write a program to empty an arraylist.
import java.util.*;
class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

       
        list.add("apple");
        list.add("banana");
        list.add("orange");

       
        list.clear();

       
        System.out.println("Empty ArrayList: " + list);
    }
}
