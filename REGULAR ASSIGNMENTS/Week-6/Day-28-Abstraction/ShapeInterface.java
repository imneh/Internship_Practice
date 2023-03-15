// Create an interface Shape with the following methods:
// public double area();
// public double perimeter();
// Create classes Circle, Rectangle, and Triangle that implement this interface.
import java.util.*; 
interface Shape{
  void area();
  void perimeter();
}
 class Circle implements Shape{
   public void area(){
     Scanner sc = new Scanner(System.in);
  System.out.println("enter the radius");
  double rad = sc.nextDouble();
double area = 3.142*rad*rad;

  System.out.println("the area of circle is" +area);
}
  public void perimeter(){
     Scanner sc = new Scanner(System.in);
  System.out.println("eneter radius");
    double rad = sc.nextDouble();
    double peri = 2*3.142*rad;
    System.out.println("perimeter of the circle is :" +peri);
  }
 }
class Rectangle implements Shape{
  public void area(){
      Scanner sc = new Scanner(System.in);
  System.out.println("enter the length and breath");
  double len = sc.nextDouble();
     double bre = sc.nextDouble();
double area = len*bre;
  System.out.println("the area of rectangle is" +area);
  }
  public void perimeter(){
      Scanner sc = new Scanner(System.in);
  System.out.println("enter the length and breath");
  double len = sc.nextDouble();
     double bre = sc.nextDouble();
double peri = 2*(len+bre);
  System.out.println("the perimeter of rectangle is" +peri);
  }
}
public class ShapeInterface{
    public static void main(String args[]){
      Shape sh = new Circle();
      Shape ss= new Rectangle();
      sh.area();
      sh.perimeter();
      ss.area();
      ss.perimeter();
    }
  }