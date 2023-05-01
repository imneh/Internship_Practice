//You are tasked with creating a program to model a School. The School has a list of Teachers and a list of Students. Each Teacher has a name and a subject that they teach. Each Student has a name and a grade level
//Your program should have the following classes:
//Teacher: This class should have private fields for the teacher's name and subject, //as well as getters and setters for these fields.
//Student: This class should have private fields for the student's name and grade level, as well as getters and setters for these fields.
//School: This class should have private fields for the list of Teachers and the list of Students, as well as methods to add and remove Teachers and Students from the lists, and methods to print the lists of Teachers and Students. Additionally, this class should have methods to find a Teacher or Student by name and to remove a Teacher or Student from the School.
//Your program should have a main method that allows users to interact with the School object and perform the actions listed above. The program should continue running until the user chooses to exit.
//I hope this gives you a good starting point for your assignment!
//Regenerate response

import java.util.*;

 class Teacher{
   private String name;
   private String subject;

   public Teacher(String name, String Subject){
     this.name = name;
     this.subject = subject;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}
}
class Student {
    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

class School {
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " teaches " + teacher.getSubject());
        }
    }

    public void printStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student.getName() + " is in grade " + student.getGradeLevel());
        }
    }

    public Teacher findTeacherByName(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        String choice = "";

        while (!choice.equals("8")) {
            System.out.println("WELCOME TO SCHOOL MANAGEMENT");
            System.out.println("1. Add a Teacher");
            System.out.println("2. Remove a Teacher");
            System.out.println("3. Add a Student");
            System.out.println("4. Remove a Student");
            System.out.println("5. Print Students List");
            System.out.println("6. Print Teachers List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                System.out.print("Enter teacher's name: ");
                String teacherName = sc.nextLine();
            System.out.print("Enter teacher's subject: ");
                    String teacherSubject = sc.nextLine();
                Teacher teacher = new Teacher(teacherName, teacherSubject);
                school.addTeacher(teacher);
                System.out.println("Teacher added.");
                break;
                case "2":
                System.out.print("Enter teacher's name: ");
                teacherName = sc.nextLine();
                teacher = school.findTeacherByName(teacherName);
                if (teacher != null) {
                  school.removeTeacher(teacher);
                  System.out.println("Teacher is Removed.");
                  school.printTeachers();
                }   
                break;
              case "3":
                System.out.println("Enter the student name :");
                String studentName = sc.nextLine();
                System.out.println("Enter grade level");
                int gradeLevel = sc.nextInt();
                Student student = new Student(studentName,gradeLevel);
                school.addStudent(student);
                System.out.println("Student added Successfully");
                break;
              case "4":
                System.out.print("Enter Students name: ");
                studentName = sc.nextLine();
                student = school.findStudentByName(studentName);
                if (student != null) {
                  school.removeStudent(student);
                  System.out.println("Student is Removed.");
                }   
                break;
              case "5":
                school.printStudents();
                break;
              case "6":
                school.printTeachers();
              case "7":
                System.out.println("Exiting>>>>>>....");
                break;
            }
        }
    }
}
