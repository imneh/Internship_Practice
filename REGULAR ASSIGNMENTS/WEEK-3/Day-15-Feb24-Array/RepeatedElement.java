import java.util.Scanner;
class RepeatedElement{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter your value");
      int search=sc.nextInt();
      int count=0;
    for(int j=0;j<n;j++){
      if(arr[j]==search){
        count++;
      }  
    }
    System.out.println("The repeated element is:"+count);
  }
}