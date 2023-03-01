import java.util.Scanner;
class ContainsSubstringVowel{
  static void checkSubString(String str1, String subString) {
    if (str1.contains(subString)) {
      for (int i = 0; i < subString.length() - 1; i++){
        if (subString.charAt(i) == 'a' || subString.charAt(i) == 'e' || subString.charAt(i) == 'i'
            || subString.charAt(i) == 'o' || subString.charAt(i) == 'u') {
          System.out.print(subString.charAt(i));

        }
      }

    } else {
      System.out.println("invalid");
    }
  }

  public static void main(String args[]) {
    checkSubString("welcome to bitlabs", "bitlabs");
  }
}