import java.util.Scanner;
class CountVowelString{
  public static void main (String args[]){
        String str = "Neha";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
    
  
