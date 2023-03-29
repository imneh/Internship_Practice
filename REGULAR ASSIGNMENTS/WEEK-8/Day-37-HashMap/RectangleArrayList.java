//Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.
import java.util.*;

 

class Rectangle{
    double length, width;

 

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

 

    double claculateArea() {
        return length * width;
    }
}

 

public class RectangleArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rectangle> rect = new ArrayList<Rectangle>();

 

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter value for rectangle " + (i + 1) + " :");
            System.out.println("Enter length :");
            double len = sc.nextDouble();
            System.out.println("Enter width :");
            double wid = sc.nextDouble();
            rect.add(new Rectangle(len, wid));
        }

 

        for (Rectangle rectangle : rect) {
            System.out.println("length is " + rectangle.length + "\twidth is" + rectangle.width);
        }

 

        for (Rectangle rectangle : rect) {
            if (rectangle.length == 2.5) {
                rect.remove(rect.indexOf(rectangle));
            }
        }

 

        for (Rectangle rectangle : rect) {
            System.out.println("length is " + rectangle.length + "\twidth is" + rectangle.width);
        }
    }
}