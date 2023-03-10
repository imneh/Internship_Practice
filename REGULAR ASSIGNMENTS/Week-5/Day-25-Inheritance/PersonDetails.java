class Person{
  String name,gender,address;
  int age;
  void details(){
    System.out.println(name+" "+age+" "+gender+" "+address);
  }
}

class Student extends Person{ 
  double sub1,sub2,sub3;
void average(){
  double avg=(sub1+sub2+sub3)/3;
  System.out.println("average marks is:" +avg);
}
void percentage(){
  double per=(sub1+sub2+sub3)/300*100;
   System.out.println("percentage is:" +per);
}
}
public class PersonDetails{
  public static void main(String args[]){
    Student obj=new Student();
    obj.name="Neha";
    obj.gender="female";
    obj.age=20;
    obj.address="Shivamogga";
    obj.sub1=60;
    obj.sub2=50;
    obj.sub3=80;
    obj.details();
    obj.average();
    obj.percentage();
  }
}