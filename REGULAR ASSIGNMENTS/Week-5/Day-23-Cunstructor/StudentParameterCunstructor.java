class StudentParamaterConstructor{
  int roll;
  String name,place;

  StudentParamaterizedConstructor(int r,String n,String p){
    roll=r;
    name=n;
    place=p;
  }

  void display(){
    System.out.println("student details " +roll+" "+name+" "+place);
  }
  public static void main(String args[]){
    StudentParamaterizedConstructor s=new StudentParamaterizedConstructor(10,"Neha","shivamogga");
    s.display();
  }
}
