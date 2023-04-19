import java.util.ArrayList;
import java.util.*;

public class Practice{
  public static void main(String args[]) {
    ArrayList<String> student = new ArrayList<String>();
    student.add("Neha");
    student.add("paa");
    student.add("maa");
    student.add("Bitlabs");
    student.add("Tekworks");

    System.out.println(student);

    String Details = student.get(2);
    System.out.println(Details);

    student.set(2, "Salman");
    System.out.println(student);

    student.remove(3);
    System.out.println(student);
  }
}