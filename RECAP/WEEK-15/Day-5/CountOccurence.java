 class CountOccurence{
    public static void main(String[] args) {
        String input = "Hello, World!";
        char targetChar = 'o';
        int occurrences = countOccurrences(input, targetChar);
        System.out.println("Occurrences of '" + targetChar + "': " + occurrences);
    }

    public static int countOccurrences(String str, char targetChar) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }

        return count;
    }
}
