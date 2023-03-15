//Create an abstract class "Person" with a non-abstract method "getFullName()". Implement two subclasses "Student" and "Teacher" which implement the "getFullName()" method and also have their own attributes such as "studentId" and "teacherId"
abstract class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public abstract String getID();
}


class Student1 extends Person1 {
    private String studentID;

    public Student1(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
    }

    public String getID() {
        return studentID;
    }
}


class Teacher extends Person1 {
    private String teacherID;

    public Teacher(String firstName, String lastName, String teacherID) {
        super(firstName, lastName);
        this.teacherID = teacherID;
    }

    public String getID() {
        return teacherID;
    }
}


public class PersonAbstract {
    public static void main(String[] args) {
        Person1 student = new Student1("Neha", "Shivanand", "1234gb5");
        System.out.println("Student full name: " + student.getFullName());
        System.out.println("Student ID: " + student.getID());
        Person1 teacher = new Teacher("Lalitha", "Ujjaneni", "987ib65");
        System.out.println("Teacher full name: " + teacher.getFullName());
        System.out.println("Teacher ID: " + teacher.getID());
    }
}