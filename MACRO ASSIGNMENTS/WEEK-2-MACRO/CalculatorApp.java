import java.util.Scanner;
class CalculatorApp{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num1,num2,sum=0;
    char operator;
    System.out.println("Enter two numbers:");
    num1=sc.nextInt();
    num2=sc.nextInt();
    System.out.println("Enter the operator");
    operator=sc.next().charAt(0);
    if(operator=='+'){
      sum=num1+num2;
      System.out.println("result is:"+sum);
    }
      else if(operator=='-'){
      sum=num1-num2;
         System.out.println("result is:"+sum);
    }
    else if(operator=='*'){
      sum=num1*num2;
       System.out.println("result is:"+sum);
    }
     else if(operator=='/'){
      sum=num1/num2;
       System.out.println("result is:"+sum);
    }
  }
}