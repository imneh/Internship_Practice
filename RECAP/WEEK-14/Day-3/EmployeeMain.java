//Define an Employee class with the following attributes:
//id (int): The ID of the employee.name (String): The name of the employee.department (String): The department of the employee.salary (double): The salary of the employee.
//Create a class called EmployeeManagementSystem to manage the employee records.
//Create a HashSet to store the Employee objects.Implement the following methods:
//addEmployee(Employee employee): Adds an Employee object to the HashSet.searchEmployee(int id): Searches for an Employee object with the given ID and returns it. If not found, returns null.deleteEmployee(int id): Deletes the Employee object with the given ID from the HashSet.
//In the EmployeeManagementSystem class, create a main method to demonstrate the functionality of the system.
//Create five Employee objects with different details.Add these objects to the employee management system.Perform the following operations:
//Search for an employee by ID.Delete an employee by ID.Print the remaining employees after deletion
import java.util.HashSet;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}

class EmployeeManagementSystem {
    private HashSet<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee searchEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee with ID " + id + " has been deleted.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void printEmployees() {
        System.out.println("Remaining Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManagementSystem empSystem = new EmployeeManagementSystem();

  
        Employee emp1 = new Employee(1, "Neha", "Engineering", 5000.0);
        Employee emp2 = new Employee(2, "salman", "Marketing", 4000.0);
        Employee emp3 = new Employee(3, "amulya", "Sales", 4500.0);
        Employee emp4 = new Employee(4, "Rian", "HR", 3500.0);
        Employee emp5 = new Employee(5, "siraaj", "Finance", 6000.0);

        empSystem.addEmployee(emp1);
        empSystem.addEmployee(emp2);
        empSystem.addEmployee(emp3);
        empSystem.addEmployee(emp4);
        empSystem.addEmployee(emp5);

        
        int searchId = 3;
        Employee searchedEmployee = empSystem.searchEmployee(searchId);
        if (searchedEmployee != null) {
            System.out.println("Employee with ID " + searchId + " found: " + searchedEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        int deleteId = 2;
        empSystem.deleteEmployee(deleteId);

        
        empSystem.printEmployees();
    }
}
