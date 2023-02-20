import java.util.Scanner;
import java.util.Random;
class WebApplication{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      Random random=new Random();
        System.out.println("Welcome to Web");   
      System.out.println("1.Calculator\n 2.Converter\n 3.Random number generator\n 4.Quit\n");
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    if(choice==1){
      int num1,num2;
      double result=0;
      char operator;
      num1=random.nextInt(100);
      num2=random.nextInt(100);
      System.out.println("choose operations to perform");
      System.out.println("a.addition \n b.subtraction \n c.multiplication \n d.division \n e.remainder");
      operator=sc.next().charAt(0);
      switch(operator)
      {
        case 'a':
          result=num1+num2;
          break;
        case 'b':
          result=num1-num2;
          break;
        case 'c':
          result=num1*num2;
          break;
        case 'd':
          result=num1/num2;
          break;
        case 'e':
          if(num2==0)
             System.out.println("divide by zero");
          else
            result=num1%num2;
          break;
        default:System.out.println("invalid operation");
      }
      System.out.println("Num 1="+num1+"\nNum 2="+num2);
      System.out.println("Result="+result);
    }
       else if(choice==2)
    {
      int Input=random.nextInt(500); 
      System.out.println("Convert to:");
     System.out.println("a.Celsius to Fahrenheit \n b.Fahrenheit to Celsius \n c.Kilometers to Miles \n d.Miles to Kilometers\n");
      String Convert=sc.next();
      double Celcius,Fahrenhit,Kilometers,miles;
      if(Convert.equals("a"))
      {
        Fahrenhit=((Input*9)/5)+32;
        System.out.println(Input+"°C="+Fahrenhit+"°F");
      }
      else if(Convert.equals("b"))
      {
        Celcius=((Input-32)*5)/9 ;
        System.out.println(Input+"°F="+Celcius+"°C");
      }
      else if(Convert.equals("c"))
      {
        miles=1.609*Input;
        System.out.println(Input+"Kelometers="+miles+"miles");
      }
      else if(Convert.equals("d"))
      {
        Kilometers=0.621*Input;
        System.out.println(Input+"miles="+Kilometers+"kilometers");
      }
      else 
        System.out.println("Invalid choice");
    }
       else if(choice==3)
    {
      int num=random.nextInt(100);
      System.out.println("Number="+num);
    }
    else if(choice==4)
      System.out.println("GOOD BYE!!!");
    else
      System.out.println("Invalid choice");
  }
}