class StudentExample{
  int id;
  String name;
  String branch;
  double sub1,sub2,sub3;
  void average(){
    double avg=(sub1+sub2+sub3)/3;
    System.out.println(name+" average is" +avg);
  }
  void percentage(){
    double totalmarks=sub1+sub2+sub3;
    double per=(totalmarks/300)*100;
    System.out.println(name+"percentage is" +per);
  }
  public static void main(String args[]){
    StudentExample st1=new StudentExample();
    st1.id=1234;
    st1.name="Neha";
    st1.branch="CSE";
    st1.sub1=45;
    st1.sub2=60;
    st1.sub3=50;
    st1.average();
    st1.percentage();
    StudentExample st2=new StudentExample();
    st2.id=4356;
    st2.name="Amulya";
    st2.branch="Mech";
    st2.sub1=90;
    st2.sub2=80;
    st2.sub3=70;
    st2.average();
    st2.percentage();
  }
}