import java.util.Scanner;
class EvenArrayMethod{
   //insert
   static void insert(int size,int arr[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter array elements");
     for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
     }
   }
   //display
   static int[] display(int n,int abc[]){
      return abc;
    
   }
 
   static int[] printEven(int n,int abc[]){
   int even[]=new int[5];
     int j=0;
     for(int i=0;i<n;i++){
       if(abc[i]%2==0){
        even[j]=abc[i];
         j++;
       }
     }
     return even;
   }
 
   static void printEvennum(int n,int a[]){
     for(int i=0;i<n;i++){
       if(a[i]%2==0){
         System.out.println(a[i]);
       }
     }
   }
 
   static int sumOfEven(int n, int a[]){
     int sum=0;
   for(int i=0;i<n;i++){
       if(a[i]%2==0){
        sum=sum+a[i];
       }
   }
     return sum;
  }
   static void sumOfEven1(int n, int a[]){
     int sum=0;
   for(int i=0;i<n;i++){
       if(a[i]%2==0){
        sum=sum+a[i];
       }
   }
     System.out.println(sum);
   }
  
   public static void main(String args[]){
    
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size");
     n=sc.nextInt();
     int a[]=new int[n];
     insert(n,a);
     int b[]=display(n,a);
    System.out.println("elements are");
     for(int i=0;i<n;i++){
       System.out.println(b[i]);
     }
 
       int even[]=printEven(n,a);
     System.out.println("even numbers");
       for(int i=0;i<even.length;i++){
         if(even[i]!=0)
       System.out.println(even[i]);
       }
 
     System.out.println("sum of even numbers");
    int sum= sumOfEven(n, a);
     System.out.println(sum);
       sumOfEven1(n,a);
    
   }
 }