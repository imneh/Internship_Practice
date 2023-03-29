//Write a Java program to copy one array list into another
import java.util.*;

class CopyArrayList {

    public static void main(String[] args) {
        
        
        ArrayList<String> sourceList = new ArrayList<String>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");
        sourceList.add("Yellow");
        

        ArrayList<String> destList = new ArrayList<String>();
        

        for(String color : sourceList) {
            destList.add(color);
        }
        
       
        System.out.println("The colors in the destination ArrayList are:");
        for(String color : destList) {
            System.out.println(color);
        }
    }

}