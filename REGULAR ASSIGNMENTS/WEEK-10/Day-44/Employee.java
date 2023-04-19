// //create class called Employee
// Accept Employee details such as id,name,address,profession,salary and create 5 employee details
// create ArrayList and all these user defined objects into ArrayList
// you have to perfrom these tasks and it should be menu driven
// 1.add employee
// 2.Update employee employee salary based on id
// 3.remove employee based on employee id
// 4.Search employee name based on employee id, if it is found display otherwise if it not found throw NameNotFoundException custom Exception
// 5.Exit


import java.util.*;


class Employee {
  private String eName, eAddress, profession;
  private long id;
  private double salary;


  Employee(String eName,String eAddress,String profession,
  long id,double salary){
    this.eAddress=eAddress;
    this.eName=eName;
    this.id=id;
    this.profession=profession;
    this.salary=salary;
  }


  public String geteName() {
    return eName;
  }


  public void seteName(String eName) {
    this.eName = eName;
  }


  public String geteAddress() {
    return eAddress;
  }


  public void seteAddress(String eAddress) {
    this.eAddress = eAddress;
  }


  public String getProfession() {
    return profession;
  }


  public void setProfession(String profession) {
    this.profession = profession;
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public double getSalary() {
    return salary;
  }


  public void setSalary(double salary) {
    this.salary = salary;
  }
}


class NameNotFoundException extends Exception{
  NameNotFoundException(String str){
    super(str);
  }
}


class Employees {
  Scanner s = new Scanner(System.in);
  ArrayList<Employee> worker = new ArrayList<Employee>();


  public void searchEmployee() throws NameNotFoundException{
    System.out.println("Enter employee id to get name");
    long id=s.nextLong();
    for(Employee e:worker){
      if(e.getId()!=id){
        throw new NameNotFoundException("There is no employee for this id");
      }
      else{
        System.out.println("Employee name is "+e.geteName());
      }
    }
  }
  public void addEmployee() {
    System.out.println("enter 5 employees details");
    int j = 1;
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter employee " + j + " details");
      System.out.println("Enter Employee name");
      String eName = s.next();
      System.out.println("Enter Employee address");
      String eAddress = s.next();
      System.out.println("Enter Employee profession");
      String profession = s.next();
      System.out.println("Enter employee id");
      long id = s.nextLong();
      System.out.println("Enter employee salary");
      double salary = s.nextDouble();


      worker.add(new Employee(eName, eAddress, profession, id, salary));
      j++;
    }
  }


  public void updateSalary() {
    System.out.println("Enter employee id");
    long id = s.nextLong();
    for (Employee e : worker) {
      if (e.getId() == id) {
        System.out.println("Enter updated salary");
        e.setSalary(s.nextDouble());
        System.out.println("Updated salary of the employee"+e.getSalary());
        break;
      }
    }
  }


   public void removeEmployee() {
    System.out.println("Enter employee id");
    long id = s.nextLong();
    for (Employee e : worker) {
      if (e.getId() == id) {
       worker.remove(e);
      }
    }
     System.out.println("After the removing employee remaining employees are");
     for(Employee e:worker){
       System.out.println(e.geteName());
     }
  }
  public int choice() {
    System.out.println("1.add employee");
    System.out.println("2.Update employee employee salary based on id");
    System.out.println("3.remove employee based on employee id");
    System.out.println("4.Search employee name based on employee id,");
    System.out.println("5, EXIT");
    System.out.println("Enter choices");
    int opt = s.nextInt();
    return opt;
  }


  public static void main(String args[]){
    Employees obj=new Employees();
    int opt;
    do{
      opt=obj.choice();
      switch(opt){
        case 1:{
          obj.addEmployee();
          break;
        }        case 2:{
          obj.updateSalary();
          break;
        }
        case 3:{
          obj.removeEmployee();
          break;
        }
        case 4:{
          try{
            obj.searchEmployee();
            break;
          }
          catch(NameNotFoundException e){
            System.out.println(e);
            break;
          }
        }
        case 5:{
          System.out.println("Thank You");
          break;
        }
      }
    while(opt!=5);
  }
}