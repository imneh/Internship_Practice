 class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4}; 

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}