//Write a Java program to join two array lists.
import java.util.*;

class JoinArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

       
        list1.add(1);
        list1.add(2);
        list1.add(3);

        
        list2.add(4);
        list2.add(5);
        list2.add(6);

        
        list1.addAll(list2);

       
        System.out.println("Joined ArrayList: " + list1);
    }
}
