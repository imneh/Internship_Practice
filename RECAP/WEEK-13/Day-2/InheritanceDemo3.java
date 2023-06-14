//Create a base class called Person with properties name and age. Derive a class Student from Person with an additional property grade. Implement a method displayInfo() in the Person class to display the name and age, and override the displayInfo() method in the Student class to display the name, age, and grade.

class Person {
   String name;
   int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade " + grade);
    }
}

class InheritanceDemo3{
  public static void main(String args[]){
    System.out.println("Student information ");
    Student stu=new Student("Neha",21,30);
    stu.displayInfo();
    System.out.println("Person Information");
    Person person=new Person("Bitlabs",50);
    person.displayInfo();
    
  }
}