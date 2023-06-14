import java.util.*;
class Student{
  private int id;
  private String name;
  private double marks;
  Student(int id,String name,double marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
    
  }
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getMarks() {
    return marks;
}
public void setMarks(double marks) {
    this.marks = marks;
}
}
class StudentDemo{
  public static void main(String args[]){
    ArrayList<Student> a=new ArrayList<>();
    a.add(new Student(5,"Neha",66.99));
    a.add(new Student(8,"Bitlabs",99.66));
    for (Student student : a) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Marks: " + student.getMarks());
    }
  }
}
 