import java.util.*;
class SumofNumbers{  
  public static void main(String args[]){  
    int n,sum=0; 
    Scanner sc=new Scanner(System.in);   
    System.out.println("Enter n value"); 
     n=sc.nextInt();   
     for(int i=1;i<=n;i++){    
     sum=sum+i;   
  }  
    System.out.println("The sum of n natural numbers is "+sum);   
  }
}