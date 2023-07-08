import java.util.Scanner;
class StringMaxMinWord{
  public static void main(String args[]){
    
    String[] str={"apple","banana","mango","watermelon"};
    
        String maxstr = arr[0], minstr = arr[0];
    
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > maxstr.length())

                maxstr = arr[i];

            if (arr[i].length() < minstr.length())

                maxstr = arr[i];

        }

        System.out.println("max String in array is " + maxstr);

        System.out.println("min String in array is " + minstr);

    }

}