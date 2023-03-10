//Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".

class Vehicle{
  String make,model;
  int year;
  
}
class Car extends Vehicle{
  String color;
  int noOfDoor;
  void  getInfo(){
   System.out.println("Make "+make);
    System.out.println("model "+model);
    System.out.println("year "+year);
    System.out.println("color "+color);
    System.out.println("no of door  "+noOfDoor);
    
  }
}
  class SuperCar extends Car{
    int topSpeed;
    void rev_engine(){
      System.out.println(".........vroom.................");
    }
  }

public class VehicleAssignmentMultilevel{
  public static void main(String args[]){
      SuperCar vh = new SuperCar();
    vh.color="black";
    vh.model="rx200";
    vh.year=2002;
    vh.noOfDoor=2;
    vh.make="Safari";
    vh.getInfo();
    vh.rev_engine();
    
  }
}