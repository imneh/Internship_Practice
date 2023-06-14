//Implement a Java class hierarchy for a vehicle rental system. Create a base class called Vehicle, which has properties like model, make, and rentalPrice, and methods like displayDetails(). Then create subclasses like Car, Motorcycle, and Bicycle, which inherit from Vehicle and have their own specific properties and methods. For example, the Car class can have a property called numDoors and a method called startEngine(), while the Motorcycle class can have a property called engineCapacity and a method called wheelie(). Test the implementation by creating instances of different vehicle classes and calling their methods.

class Vehicle {
  private String model;
  private String make;
  private int rentprice;

 

  Vehicle(String model, String make, int rentprice) {
    this.model = model;
    this.make = make;
    this.rentprice = rentprice;
  }

 

  public void displayDetails() {
    System.out.println("vehicle name" + model + " " + make);
    System.out.println("rental price of that vehicle" + rentprice);
  }

 

  class Car extends Vehicle {
    private int numofdoors;

 

    Car(String model, String make, int rentprice, int numofdoors) {
      super(model, make, rentprice);
      this.numofdoors = numofdoors;
    }

 

    public void startEngine() {
      System.out.println("the car engine is started of" + model + " " + make);
    }
  }

 

  class Motorcycle extends Vehicle {
    private int enginecapcity;

 

    Motorcycle(String model, String make, int rentprice, int enginecapacity) {
      super(model, make, rentprice);
      this.enginecapcity = enginecapacity;
    }

    public void Wheelie() {
      System.out.println("it is preferred by wheelie" + make + " " + model);
    }
  }

  class Bicycle extends Vehicle {
    private int numofgears;

    Bicycle(String model, String make, int rentprice, int numofgears) {
      super(model, make, rentprice);
      this.numofgears = numofgears;
    }

 

    public void Ringbell() {
      System.out.println("horn in bicycle" + model + " " + make);
    }
  }
}

 

class RentalDetails {
  public static void main(String args[]) {
   Car car = new Car("BMW", "Q5", 79, 4);
    car.displayDetails();
    car.startEngine();

    System.out.println();

    Motorcycle bike = new Motorcycle("KTM", "jokku", 21, 180);
    bike.displyDetails();
    bike.Wheelie();

 

Bicycle cycle = new Bicycle("hercules", "modayaano", 13, 5);
    cycle.displayDetails();
    cycle.Ringbell();
  }
}