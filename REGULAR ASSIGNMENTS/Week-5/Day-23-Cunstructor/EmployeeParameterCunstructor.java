import java.util.Scanner;
class Employee{
  int eid;
  String name;
  double salary;
  //parameterized Constructor
  Employee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
 
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }
 
  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
  
}
 
public class EmployeeParameterCunstructor{
    public static void main(String args[]){
    System.out.println("enter employee information");
    Scanner sc=new Scanner(System.in);
    Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    System.out.println("********Employee Information*********");
      emp.display();
      emp.grossSalary(1200, 1500);
    
  }
}