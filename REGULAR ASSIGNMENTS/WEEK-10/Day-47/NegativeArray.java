//Write a JAVA program to print all negative elements in an array.
class NegativeArray{
    public static void main(String[] args) {
        int[] arr = {-2, 3, -5, 6, 8, -9, 10, -12};
       
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] < 0) {
            
                System.out.println(arr[i]);
            }
        }
    }
}
