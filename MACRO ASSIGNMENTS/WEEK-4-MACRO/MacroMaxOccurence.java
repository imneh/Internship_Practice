import java.util.Scanner;
public class MacroMaxOccurence {
	static final int ASCII_SIZE = 256;
	static char getMaxOccurringChar(String str)
	{
		// Create array to keep the count of individual characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];
		for (int i = 0; i <str.length(); i++)
			count[str.charAt(i)]++;
		int max = -1; // Initialize max count
		char result = ' '; // Initialize result
		for (int i = 0; i < str.length(); i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		String str = "hello bitlbs";
		System.out.println("Max occurring character is "+ getMaxOccurringChar(str));
	}
}