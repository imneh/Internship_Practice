abstract class Student {
  String name;
  int id;
  static String clgName = "sjec";
  int grade;
  int marks;

  Student(String n1, int id1) {
    name = n1;
    id = id1;
  }

  Student(String n2, int id2, int g) {
    this(n1, id1);
    grade = g;
  }

  abstract void displayId();

  public void displayStudent() {
    System.out.println(name + " " + id + " " + clgName);
  }

  final void studentGrade() {
    this.displayStudent();
    System.out.println("grade = " + grade);
  }
}

class RegularStudent extends Student {
  String department;
  int marks;

  void displayId() {
    System.out.println("id of the student = " + id);
  }

  RegularStudent(String name, int id, int grade, String dep) {
    super(n2, id2, g);
    department = dep;
  }

  public void displayStudent() {
    super.displayStudent();
    System.out.println(department);
  }
}

class Shape {
  void draw() {
    System.out.println("shape");
  }

  void draw(int radius) {
    System.out.println("shape" + (radius * radius));
  }

  void draw(int length, int breadth) {
    int area = 2 * (lenght + breadth);
    System.out.println("area =" + area);
  }

}

class OopsDemo {
  public static void main(String args[]) {
    Student s1 = new Student("roshan", 101, 9);
    Student s2 = new Student("elvin", 19, 8);

  }
}