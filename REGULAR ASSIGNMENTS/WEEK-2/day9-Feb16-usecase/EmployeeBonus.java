import java.util.Scanner;
class EmployeeBonus{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Salary");
    int salary=sc.nextInt();
    System.out.println("Select your performance rating:");
    String performance=sc.next();
    double balance=0;
    if(performance.equals("EXCELLENT"))
    {
      balance=0.1*salary;
      System.out.println("Bonus:"+balance);
    }
    else if(performance.equals("GOOD"))
    {
      balance=0.05*salary;
      System.out.println("Bonus:"+balance);
    }
    else if(performance.equals("Average"))
    {
      balance=0.02*salary;
      System.out.println("Bonus:"+balance);
    }
    else if(performance.equals("Poor"))
    {
      System.out.println("No Bonus:");
    }
    else
      System.out.println("Invalid input");
  }
}