import java.util.Scanner;
class PrimeArray{
  public static void main(String args[]){
   int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt(); 
    }
    for(int i=0;i<5;i++){
      int count=0;
    for(int j=0;j<arr[i];j++){
       if(arr[i]%i==0){
         count++;
     }
   }
      if(count==2){
        System.out.println(arr[i]);
      }
  }
 }
}