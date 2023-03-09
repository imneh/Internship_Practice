class Circle {

  int radius;
  int diameter;

  Circle(int radius) {
    this.radius = radius;
    this.diameter = 2 * radius;
  }
  void display() {
    System.out.println("Radius :" + radius);
    System.out.println("Diameter :" + diameter);
  }
  void area() {
    System.out.println("Area of circle is: " + (3.14 * radius * radius));
  }
}
public class CircleUsingConstructor{
  public static void main(String[] args) {
    Circle c = new Circle(5);
    c.display();
    c.area();
  }
}