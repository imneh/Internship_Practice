 //Create a class called Vehicle with attributes make, model, and year. Create a subclass called Car that inherits from Vehicle and adds attributes color and num_doors. Create a method in Car called get_info() that prints out the make, model, year, color, and number of doors of the car.

class Vehicle {
  String make, model;
  int year;
}

class Car extends Vehicle {
  String color;
  int noOfDoor;
  
  void getInfo() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + color);
    System.out.println("No. of doors: " + noOfDoor);
  }
}

public class VehicleInheritance {
  public static void main(String[] args) {
    Car car = new Car();
    car.color = "blue";
    car.model = "rx200";
    car.year = 2011;
    car.noOfDoor = 2;
    car.make = "bmw";
    car.getInfo();
  }
}