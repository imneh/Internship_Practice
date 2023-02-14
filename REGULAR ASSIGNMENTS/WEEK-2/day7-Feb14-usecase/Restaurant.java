import java.util.Scanner;
class Restaurant{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Food Cost");
    double foodcost=sc.nextDouble();
    double tax=0.05*foodcost;
    System.out.println("Tax:"+tax);
    System.out.println("Enter the Tip:");
    double tip=sc.nextDouble();
    double bill=foodcost+tax+tip;
    System.out.println("Total Bill:" +bill); 
  }
}