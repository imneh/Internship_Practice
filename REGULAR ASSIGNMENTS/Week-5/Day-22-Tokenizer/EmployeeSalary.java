import java.util.*;

class Employee {
  String empid;
  String empname;
  String empAddress;
  double salary, HRA, DA;

  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee id");
    empid = sc.next();
    System.out.println("enter employee name");
    empname = sc.next();
    System.out.println("Enter the basic salary of an employee");
    salary = sc.nextInt();
    System.out.println("enter employee address");
    empAddress = sc.next();
    System.out.println("enter the HRA");
    HRA = sc.nextDouble();
    System.out.println("enter the DA");
    DA = sc.nextDouble();
  }

 
  void calculate() {
     double hra = (HRA / 100) * salary;
    System.out.println(hra);
    double da = (DA / 100) * salary;
    System.out.println(da);
    double GS = salary + DA + HRA;
    System.out.println(GS);
    double incometax = 0.3*salary;
    System.out.println(incometax);
    double netsalary = GS - incometax;
    System.out.println(netsalary);
  }

  void display() {
    System.out.println("employee id :" + empid);
    System.out.println("employee name :" + empname);
    System.out.println("employee address :" + empAddress);
    System.out.println("employee salary :" + salary);
  }
}


public class EmployeeSalary{
  public static void main(String args[]) {
    Employee emp = new Employee();
    emp.read();
    emp.display();
    emp.calculate();
  }
}