import java.util.*;
class SumOfDigit{
	public static void main(String arg[]){
    int num,dig,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    while(num>0){
      dig=num%10;
      sum=sum+dig;
      num=num/10;
    }
    System.out.println("Sum of digit:"+sum);
  }
}
      