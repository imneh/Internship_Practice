public class ArrayUtils {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static float sum(float[] arr) {
        float sum = 0;
        for (float num : arr) {
            sum += num;
        }
        return sum;
    }

    public static long sum(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        float[] floatArray = {1.2f, 2.2f, 3.2f, 4.2f, 5.2f};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};

        System.out.println("Sum of intArray: " + sum(intArray));
        System.out.println("Sum of doubleArray: " + sum(doubleArray));
        System.out.println("Sum of floatArray: " + sum(floatArray));
        System.out.println("Sum of longArray: " + sum(longArray));
    }
}