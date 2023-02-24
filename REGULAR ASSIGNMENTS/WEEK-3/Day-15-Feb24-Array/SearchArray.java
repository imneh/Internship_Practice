import java.util.Scanner;
class SearchArray{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element you want to search :");
    int search = sc.nextInt();
    int count =0;
    for(int j=0;j<arr.length;j++ ){
      if(search==arr[j]){
        count++;
        System.out.println("Element is found at the pos "+j);
       
    }
    }
      if(count==0){
        System.out.println("element is not found");
      }
   
}
}
 