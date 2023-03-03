import java.util.Scanner;
class StringConcat{  
    public static void main(String[] args) {      
        String str1 = "Hello";  
        String str2 = "Bitlabs";  
        String str3 = "Lalitha";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
    }  
}  