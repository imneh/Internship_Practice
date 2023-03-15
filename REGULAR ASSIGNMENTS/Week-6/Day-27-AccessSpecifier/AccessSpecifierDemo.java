//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
//Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
//Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
class Demo{
  protected int price;
  int pid;
}

class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}

class AccessSpecifierDemo{
  public static void main(String args[]){
    Demo1 d=new Demo1();
    d.price=12;
    d.display();
  }
}