//write a java program to create one student class with properties id name and age create one constructor assign values and create main class create hashset and store 5 student details based on id
import java.util.HashSet;

class Student {
    private int id;
    private String name;
    private int age;
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
  public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (obj == null || getClass() != obj.getClass())
            return false;
        
        Student otherStudent = (Student) obj;
        return id == otherStudent.id;
    }
    public int hashCode() {
        return id;
    }
}
public class StudentHashset{
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        
        
        Student student1 = new Student(1, "Neha", 20);
        Student student2 = new Student(2, "Salman", 21);
        Student student3 = new Student(3, "amulya", 19);
        Student student4 = new Student(4, "siraaj", 22);
        Student student5 = new Student(5, "Rian", 20);

      
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        
        for (Student student : studentSet) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("--------------------");
        }
    }
}


        
    