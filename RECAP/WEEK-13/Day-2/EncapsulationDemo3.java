//Create a class called Car with private properties make, model, and year. Implement public methods to get and set the car's make, model, and year. Use encapsulation to protect the internal state of the car object and allow controlled access to its properties.
class Car{
  private String make;
  private int model;
  private int year;
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
class CarDemo{
  public static void main(String args[]){
    Car c = new Car();
    c.setMake("Car");
    c.setModel(3456);
    c.setYear(2023);
    System.out.println(c.getMake()+" "+c.getModel()+" "+c.getYear());
  }
}