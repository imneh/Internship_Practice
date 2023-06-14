  class Person{
  private int age;
  private String name;

  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
  
    public void setAge(int age) {
      if(age>0){
      this.age = age;
      }
      else{
        System.out.println("Invalid age");
      }
    }
}
class EncapsulationDemo{
  public static void main(String args[]){
    Person obj=new Person();
    obj.setName="Neha";
    obj.setAge="21";
    System.out.println(obj.getName());
    System.out.println(obj.getAge()); 
  }
}
