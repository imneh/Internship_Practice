import java.util.*;
class Employee{
  int id;
  double salary;
  String name,pos,adress;
  Employee(String name,String pos,String adress,int id,double salary){
    this.name=name;
    this.pos=pos;
    this.adress=adress;
    this.id=id;
    this.salary=salary;
  }
}

class EmployeeArrayList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter details of an Employee");
    ArrayList<Employee> s=new ArrayList<Employee>();
    for(int i=0;i<5;i++){
      s.add(new Employee(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble()) );
    }
    
    for(Employee emp:s){
      System.out.println(emp.name+" "+emp.pos+" "+emp.adress+" "+emp.id+" "+emp.salary);
    }
  }
}