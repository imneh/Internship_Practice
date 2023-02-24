import java.util.*;  
 class InsertionEnd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
      System.out.print("Enter the element to insert at end: ");
        arr[n] = sc.nextInt();
      System.out.println("Array After Inserting "+ arr[n] +" at end");
        for(int i=0; i<n+1; i++)
        {
            System.out.println(arr[i]);
        }
	}
}