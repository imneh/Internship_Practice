//Write a Java program to update specific array element by given element
  import java.util.*;
    class UpdateArrayList{

    public static void main(String[] args) {
        
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        
        
        int index = 2; 
        int newNumber = 5;
        numbers.set(index, newNumber);
        
        
        System.out.println(numbers);
    }

}