import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>{
  private int id;
  private String name;
  private String dept;
  private int age;
  Student(int id,String name,String dept,int age){
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.age=age;
  }
public int compareTo(Student st) {
  return name.compareTo(st.name);

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
public String getDept() {
    return dept;
}
public void setDept(String dept) {
    this.dept = dept;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}  
}