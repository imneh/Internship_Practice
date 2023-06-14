import java.util.*;
class Student {
    private String name;
    private String id;
    private int marks;

    Student(String name, String id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class HashSetExample{
    public static void main(String args[]) {
        Set<Student> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student details for the set:");
        for (int i = 0; i < 3; i++) {
            set.add(new Student(sc.next(), sc.next(), sc.nextInt()));
        }

        System.out.println("Students in the set:");
        for (Student student : set) {
            System.out.println(student.getName() + " " + student.getMarks() + " " + student.getId());
        }
    }
}