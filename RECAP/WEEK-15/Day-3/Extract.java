import java.util.Scanner;
class Extract{
public static void main(String args[]){
  int num=123;
  int rem,sum=0;
  while(mum!=0){
    rem=num%10;
    sum=sum+rem;
    num=num/100;   
  }
  System.out.println(sum);
}
}
