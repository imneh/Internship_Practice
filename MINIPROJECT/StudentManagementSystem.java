// Create an abstract class called "Person" with the following attributes:

// Name (String)
// ID (String)
// abstract void displayDetails(): An abstract method to display the details of a person.

// Create an interface called "Markable" with the following method:

// double calculatePercentage(): Calculates and returns the percentage based on the marks.

// Create a class called "Student" that inherits from the "Person" class and implements the "Markable" interface. Include the following attributes:

// Roll Number (String)
// Marks (ArrayList<Integer>)
// Implement the abstract method displayDetails() to display the details of a student.
// Implement the interface method calculatePercentage() to calculate and return the percentage.

// Create a class called "StudentManagementSystem" to manage the students. It should have the following methods:

// void addStudent(Student student): Adds a student to the ArrayList.
// void removeStudent(String rollNumber): Removes a student from the ArrayList based on the roll number.
// void updateStudentMarks(String rollNumber, ArrayList<Integer> marks): Updates the marks of a student with the given roll number.
// void displayStudentDetails(String rollNumber): Displays the details of a student based on the roll number.
// void displayAllStudents(): Displays the details of all the students in the ArrayList.
// double calculateAveragePercentage(): Calculates and returns the average percentage of all the students.

// In the main program, create an object of the StudentManagementSystem class and perform the following operations:

// Add a few students using the addStudent method.
// Display the details of all the students using the displayAllStudents method.
// Display the details of a specific student using the displayStudentDetails method.
// Update the marks of a student using the updateStudentMarks method.
// Remove a student using the removeStudent method.
// Calculate and display the average percentage of all the students using the calculateAveragePercentage method.
import java.util.*;
abstract class Person{
  private String name;
  private int id;
  public abstract void displayDetails();

  Person(String name,int id){
    this.name=name;
    this.id=id;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
  
  
}
interface Markable{
  public double calculatePercentage();
}


class Student extends Person implements Markable{
  private String Roll_Number;
  private ArrayList<Integer> marks;

  
  Student(String name,int id ,String Roll_number,ArrayList<Integer> marks){
    super(name, id);
    this.Roll_Number=Roll_number;
    this.marks=marks;
  }
  
  public String getRoll_Number() {
	  return Roll_Number;
  }


  public void setRoll_Number(String roll_Number) {
	  Roll_Number = roll_Number;
  }


  public ArrayList<Integer> getMarks() {
	  return marks;
  }


  public void setMarks(ArrayList<Integer> marks) {
	  this.marks = marks;
  }


  public void displayDetails(){
    System.out.println("name :"+getName()+"\nid: "+getId()+"\nrollnumber :" +Roll_Number+"\nmarks :"+marks+"\npercentage : "+calculatePercentage()+"%");
  }

  
  public double calculatePercentage(){
    int totalMarks=0;
    for(Integer i:marks){
      totalMarks=totalMarks+i;
    }
    return (double) totalMarks/marks.size();
  }
}


class StudentManagementSystem{
  ArrayList<Student> list=new ArrayList<Student>();
  void addStudent(Student student){
    list.add(student);
    System.out.println("student added succesfully");
  }
  void removeStudent(String rollNumber){
    for(Student i:list){
      if(i.getRoll_Number().equalsIgnoreCase(rollNumber)){
        list.remove(list.indexOf(i));
        break;
      }
    }
  }
  void updateStudentMarks(String rollNumber, ArrayList<Integer> marks){
    for(Student i:list){
      if(i.getRoll_Number().equalsIgnoreCase(rollNumber)){
        i.setMarks(marks);
        break;
      }
    }
  }
  void displayStudentDetails(String rollNumber){
    for(Student i:list){
      if(i.getRoll_Number().equals(rollNumber)){
        i.displayDetails();
      }
    }
  }
  void displayAllStudents(){
    System.out.println("student details :");
    for(Student i:list){
      i.displayDetails();
    }
  }
  double calculateAveragePercentage(){
    double totalPercentage=0.0;
    for(Student i:list){
      totalPercentage += i.calculatePercentage();
    }
    return totalPercentage/list.size();

  }
  
  
  
  
}
class StudentMain{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StudentManagementSystem s=new StudentManagementSystem();
    int choice;
    do{
       System.out.println("enter your choice :\n1.Add student\n2.Delete student\n3.Update student marks\n4.display student details\n5.Display all students\n6.to caluculate average percentage of all students\n7.exit");
      choice = sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("enter the student details:");
          System.out.println("enter the name");
          String name=sc.next();
          System.out.println("enter the id");
          int id=sc.nextInt();
          System.out.println("enter the roll number ");
          String rollnum=sc.next();
          System.out.println("enter the marks for 5 subjects ");
          ArrayList<Integer> marks=new ArrayList<>();
          for(int i=0;i<5;i++){
            marks.add(sc.nextInt());
          }
          Student student=new Student(name,id,rollnum,marks);
          s.addStudent(student);
          break;
        case 2:
          System.out.println("enter the roll number ");
          String rollnumber=sc.next();
          s.removeStudent(rollnumber);
          break;
        case 3:
          System.out.println("enter the roll number of the student ");
          String rollNumber=sc.next();
          ArrayList<Integer> newMarks=new ArrayList<>(List.of(67,78,97,78,70));
          s.updateStudentMarks(rollNumber, newMarks);
          break;
        case 4:
          System.out.println("enter the roll number of the student ");
          String rollNum=sc.next();
          s.displayStudentDetails(rollNum);
          break;
        case 5:
          s.displayAllStudents();
          break;
        case 6:
          System.out.println("average of percentages of all students :"+s.calculateAveragePercentage());
          ;
          break;
        case 7:
          System.out.println("done");
          break;
        default:
          System.out.println("invalid choice");
          break;
      }
    }while(choice!=7);
  }
}