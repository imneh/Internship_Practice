//Create a base class called Vehicle with properties color and fuelType and a method startEngine(). Derive two classes Car and Motorcycle from Vehicle. Implement the startEngine() method in each derived class to print a message indicating the vehicle type and engine start.
class Vehicle{
  String color;
  String fuelType;

  public void startEngine(){
    System.out.println("Starts the Engine");
  }
}
class Car extends Vehicle{
  public void startEngine(){
    System.out.println("Starts the Engine of car");
  }
}
class Motorcycle extends Vehicle{
  public void startEngine(){
     System.out.println("Starts the Engine of motorcycle");
  } 
}

class InheritanceDemo{
  public static void main(String args[]){
    Vehicle vehicle=new Vehicle();
    vehicle.startEngine();
    Car car=new Car();
    car.startEngine();
    Motorcycle motorcycle=new Motorcycle();
    motorcycle.startEngine();
  }
}
