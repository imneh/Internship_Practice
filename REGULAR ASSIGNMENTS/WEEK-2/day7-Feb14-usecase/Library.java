import java.util.Scanner;
class Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the BookID");
    int num1=sc.nextInt();
    System.out.println("Enter the BorrowerID");
    int num2=sc.nextInt();
    System.out.println("Enter the Author name");
    String AuthorName=sc.next();
    System.out.println(" Enter phone number");
    long ph=sc.nextLong();
    System.out.println("Enter the name of the book");
    String BookName=sc.next();
    System.out.println("BookID" +num1);
    System.out.println("BorrowerID" +num2); 
    System.out.println("AuthorName" +AuthorName);
    System.out.println("nameofbook" +BookName); 
    System.out.println("Phone Number: "+ph);
  }
  }