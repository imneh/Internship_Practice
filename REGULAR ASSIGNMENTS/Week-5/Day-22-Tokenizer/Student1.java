import java.util.Scanner;
public class Student1{
  int id;
  String name;
  String branch;
  double sub1,sub2,sub3;
  void average(){
    double avg=(sub1+sub2+sub3)/3;
    System.out.println(name+" average is"+avg);
  }
  void percentage(){
    double totalmarks=sub1+sub2+sub3;
    double per=(totalmarks/300)*100;
    System.out.println(name+" per is"+per);
  }
 
  public static void main(String args[]){
   //int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    Student st[]=new Student[5];
    for(int i=0;i<5;i++){
       st[i]=new Student();
      System.out.println("enter id");
      st[i].id=sc.nextInt();
      System.out.println("Enter name");
      st[i].name=sc.next();
      System.out.println("Enter branch");
      st[i].branch=sc.next();
      System.out.println("Enter sub1");
      st[i].sub1=sc.nextDouble();
      System.out.println("Enter sub2");
      st[i].sub2=sc.nextDouble();
      System.out.println("Enter sub3");
      st[i].sub3=sc.nextDouble();
      st[i].average();
      st[i].percentage();
      
      
    }
 
  
    
  }
}