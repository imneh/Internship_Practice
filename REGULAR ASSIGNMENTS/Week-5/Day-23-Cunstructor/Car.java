import java.util.*;

class Car {
  String make;
  String model;
  String color;
  int year;


  public void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the car maker");
    make = sc.nextLine();
    System.out.println("enter the car model");
    model = sc.nextLine();
    System.out.println("enter the color of car");
    color = sc.nextLine();
    System.out.println("enter the year");
    year = sc.nextInt();

  }

  public void display() {
    System.out.println("The maker of Car:-" + make);
    System.out.println("The model of car is:-" + model);
    System.out.println("The color of the car:-" + color);
    System.out.println("The year of this car:-" + year);
  }
}

public class Carmain {

  public static void main(String args[]) {
    Car c1 = new Car();
    c1.read();
    c1.display();
  }
}