import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        String result = findLongestPalindromeSubstring(str);
        System.out.println("The longest palindrome substring is: " + result);
    }

    public static String findLongestPalindromeSubstring(String str) {
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String odd = expandAroundCenter(str, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }
            String even = expandAroundCenter(str, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }

    public static String expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
