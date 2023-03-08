public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Permutations of the given string:");
        generatePermutations(input.toCharArray(), 0);
    }

    public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, i, index);
                generatePermutations(chars, index + 1);
                swap(chars, i, index);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}