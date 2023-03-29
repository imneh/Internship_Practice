//Write a Java program to shuffle elements in a array list
import java.util.*;
import java.util.Collections;

public class ShuffleArrayList{

    public static void main(String[] args) {
        
        
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        
        Collections.shuffle(colors);
        
        
        System.out.println("The shuffled colors are:");
        for(String color : colors) {
            System.out.println(color);
        }
    }

}