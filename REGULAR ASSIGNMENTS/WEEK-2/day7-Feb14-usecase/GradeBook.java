import java.util.Scanner;
class GradeBook{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Grade of subject 1");
    int sub1=sc.nextInt();
    System.out.println("Enter Grade of subject 2:");
    int sub2=sc.nextInt();
    System.out.println("Enter Grade of subject 3:");
    int sub3=sc.nextInt();
    int average=(sub1+sub2+sub3)/3;
    System.out.println("Average Grade:" +average); 
  }
}