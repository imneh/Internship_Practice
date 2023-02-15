import java.util.Scanner;
class VoteEligibility{
  public static void main(String args[]){
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age");
    age=sc.nextInt();
    if(age>=18){
      System.out.println("yes!the person is eligible.");
    }
    else{
     System.out.println("ohh No! the person is not eligible.");
   }
  }
}