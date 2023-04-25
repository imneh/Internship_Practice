//You are tasked with creating a program to model a School. The School has a list of Teachers and a list of Students. Each Teacher has a name and a subject that they teach. Each Student has a name and a grade level
//Your program should have the following classes:
//Teacher: This class should have private fields for the teacher's name and subject, //as well as getters and setters for these fields.
//Student: This class should have private fields for the student's name and grade level, as well as getters and setters for these fields.
//School: This class should have private fields for the list of Teachers and the list of Students, as well as methods to add and remove Teachers and Students from the lists, and methods to print the lists of Teachers and Students. Additionally, this class should have methods to find a Teacher or Student by name and to remove a Teacher or Student from the School.
//Your program should have a main method that allows users to interact with the School object and perform the actions listed above. The program should continue running until the user chooses to exit.
//I hope this gives you a good starting point for your assignment!
//Regenerate response

import java.util.Scanner;

public class MicroProject{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        boolean running = true;
        while (running) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add teacher");
            System.out.println("2. Remove teacher");
            System.out.println("3. Add student");
            System.out.println("4. Remove student");
            System.out.println("5. Find teacher by name");
            System.out.println("6. Find student by name");
            System.out.println("7. Print list of teachers");
            System.out.println("8. Print list of students");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    System.out.println("Enter teacher name:");
                    String teacherName = scanner.nextLine();
                    System.out.println("Enter subject:");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherName, subject);
                    school.addTeacher(teacher);
                    System.out.println("Teacher added.");
                    break;
                case 2:
                    System.out.println("Enter teacher name:");
                    teacherName = scanner.nextLine();
                    teacher = school.findTeacherByName(teacherName);
                    if (teacher != null) {
                        school.removeTeacher(teacher);
                        System.out.println("Teacher removed.");
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter student name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter grade level:");
                    int gradeLevel = scanner.nextInt();
                    scanner.nextLine(); // consume the new line character
                    Student student = new Student(studentName, gradeLevel);
                    school.addStudent(student);
                    System.out.println("Student added.");
                    break;
                case 4:
                    System.out.println("Enter student name:");
                    studentName = scanner.nextLine();
                    student = school.findStudentByName(studentName);
                    if (student != null) {
                        school.removeStudent(student);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter teacher name:");
                    teacherName = scanner.nextLine();
                    teacher = school.findTeacherByName(teacherName);
                    if (teacher != null) {
                        System.out.println("Teacher found: " + teacher.getName() + " (" + teacher.getSubject() + ")");
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter student name:");
                    studentName = scanner.nextLine();
                    student = school.findStudentByName(studentName);
                    if (student != null) {
                        System.out.println("Student found: " + student.getName() + " (Grade " + student.getGradeLevel() + ")");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 7:
                    school.printTeachers();
                    break;
                case 8:
                    school.printStudents();
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}