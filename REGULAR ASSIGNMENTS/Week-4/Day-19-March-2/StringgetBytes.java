import java.util.*;
 class StringgetBytes{
    public static void main(String args[])
    {
        // Declaring and initializing a string
        String str = "Bitlabs Tekworks";
        // using getBytes() method
        byte[] b = str.getBytes();
        // Printing converted string after conversion
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}