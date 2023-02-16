import java.util.Scanner;
class EmployeeSalaryCalculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double salary,anual_salary,tax=0,net_salary;
    System.out.println("Enter your Salary");
    salary=sc.nextDouble();
    anual_salary=salary*12;
    System.out.println("Your anual salary : "+anual_salary);
    if (anual_salary<300000){
      System.out.println("There is no gst tax");
    }
    else if(anual_salary>=300000 && anual_salary<600000){
      System.out.println("You have to pay 5% of income");
      tax=anual_salary*0.05;
    }
    else if(anual_salary>=600000 && anual_salary<900000){
      System.out.println("You have to pay 10% of income");
      tax=anual_salary*0.10;
    }
    else if(anual_salary>=900000 && anual_salary<1200000){
      System.out.println("You have to pay 15% of income");
      tax=anual_salary*0.15;
    }
    else if(anual_salary>=1200000 && anual_salary<1500000){
      System.out.println("You have to pay 20% of income");
      tax=anual_salary*0.20;
    }
    else {
      System.out.println("You have to pay 30% of income");
      tax=anual_salary*0.30;
    }
    System.out.println("Your tax is :"+tax);
    net_salary=anual_salary-tax;
    System.out.println("Your net Salary : "+net_salary);
  }
}