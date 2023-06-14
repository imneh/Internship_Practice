//Create a class called Employee with private properties name, position, and salary. Implement public methods to get the employee's name and position and set the employee's salary. Use encapsulation to ensure that the salary can only be modified through the defined method.
class Employee {
  private String name;
  private String position;
  private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}

public class EmployeeDemo {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setName("NEHA");
    employee.setPosition("HR");
    employee.setSalary(8000.0);

    System.out.println("Name: " + employee.getName());
    System.out.println("Position: " + employee.getPosition());
    System.out.println("Salary: " + employee.getSalary());
  }
}