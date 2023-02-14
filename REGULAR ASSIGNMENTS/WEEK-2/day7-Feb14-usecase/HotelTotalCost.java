import java.util.Scanner;
class HotelTotalCost {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the room rate");
    int roomrate=sc.nextInt();
    System.out.println("Enter the number of nights staying");
     int nights=sc.nextInt();
     int totalcost=(roomrate*nights);
    System.out.println("Totalcost:" +totalcost);
    
  }
}


