import java.util.Scanner;
class CarParamaterizedConstructor{
  String name,model,color;
  int year;

  CarParamaterizedConstructor(String n,String m,String c,int y){
    name=n;
    model=m;
    color=c;
    year=y;
  }

  void display(){
    System.out.println("the name of the car is:"+name);
    System.out.println("the model of the car is:"+model);
    System.out.println("the color of the car is:"+color);
    System.out.println("the car launched in the year:"+year);
    System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    CarParamaterizedConstructor c=new CarParamaterizedConstructor("neha","new","red",2026);
    c.display();
  }
}