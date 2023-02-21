import java.util.*;
class DoSumofEven {
  public static void main(String args[]){    
    int n=20,sum=0;    
    int i=2;    
    do{     
      sum=sum+i; 
      i=i+2;   
    }while(i<=n);  
    System.out.println(sum);
  } 
}
