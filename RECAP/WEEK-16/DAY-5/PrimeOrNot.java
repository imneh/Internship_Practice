//Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//WAP to check whether a number is Prime number or not
import java.util.*;
class PrimeOrNot{ 
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);   
    System.out.println("Enter n value");
    int n=sc.nextInt();     
    int count=0;   
    for(int i=1;i<=n;i++){    
      if(n%i==0){    
        count++;    
      }    
    }     
    if(count==2){    
      System.out.println("Its prime number");  
    }     
    else 
    {     
      System.out.println("It's not a prime number");  
    }  
  } 
}


