import java.util.*;

class Rectangle {
  int length;
  int width;


  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of rectangle");
    length = sc.nextInt();
    System.out.println("enter the width of rectangle");
    width = sc.nextInt();
  }

  void calculate() {
    double area = length * width;
    System.out.println("the area of rectangle is :-" + area);
    double perimeter = 2 * (length + width);
    System.out.println("the perimeter of rectangle is :-" + perimeter);
  }

  void display() {
    System.out.println("the length of rectangle is :-" + length);
    System.out.println("the width of rectangle is :-" + width);
  }
}

public class Rectanglemain{

  public static void main(String args[]) {
    Rectangle rec = new Rectangle();
    rec.read();
    rec.calculate();
    rec.display();
  }
}