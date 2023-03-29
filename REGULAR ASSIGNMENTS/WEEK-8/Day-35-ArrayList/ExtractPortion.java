//Write a Java program to extract a portion of a array list.
import java.util.*;
class ExtractPortion{

    public static void main(String[] args) {
        
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        
        ArrayList<Integer> subList = new ArrayList<Integer>(numbers.subList(1, 4));
        
        
        System.out.println("The extracted sub-list is:");
        for(Integer num : subList) {
            System.out.println(num);
        }
    }

}