//Create a class called "Student" with attributes "name", "id", and "major". Create an ArrayList of Student objects and add 6 students to it. Print the name and major of each student. Change the major of one student and print the updated information.

import java.util.*;

   class Student{
    private int id;
    private String name;
    private String major;
   

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
     public void setMajor(String major){
       this.major=major;
     }

   
}
   public class StudentAssignment{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<Student>();

       
        list.add(new Student(2001, "neha", "ComputerScience"));
        list.add(new Student(2002, "salman", "Civil"));
        list.add(new Student(2003, "siraaj", "BioChemistry"));
        list.add(new Student(2004, "shaheed","Hydrology"));
        list.add(new Student(2005, "amulya", "Psychology"));
        list.add(new Student(2006,"alvin","Electronics"));
       
        for (Student s :list) {
            System.out.println("Name: " + s.getName());
            System.out.println("Major: " + s.getMajor());
            
        }
      list.get(3).setMajor("ArtificialIntelligence");
      System.out.println("Updated information");
      System.out.println("Name: " + list.get(3).getName());
        System.out.println("ID: " + list.get(3).getId());
        System.out.println("Major: " + list.get(3).getMajor());
     }
   }