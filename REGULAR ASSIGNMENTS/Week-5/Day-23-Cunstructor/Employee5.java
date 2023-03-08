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
 
public class Employee5{
    public static void main(String args[]){
    System.out.println("enter employee information");
    Scanner sc=new Scanner(System.in);
    Employee emp[]=new Employee[5];
      
      for(int i=0;i<5;i++){
        System.out.println("enter employee "+(i+1)+ " details");
        emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
      }
  
    System.out.println("********Employee Information*********");
      for(int i=0;i<5;i++){
      emp[i].display();
        System.out.println("enter hra and Da Details");
      emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
      }
      
  }
}