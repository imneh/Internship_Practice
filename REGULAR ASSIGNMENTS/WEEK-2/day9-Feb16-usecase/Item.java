import java.util.Scanner;
class Item{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean item;
    Double Funds,item_Cost;
    System.out.println("Add fund to your account");
    Funds = sc.nextDouble();
    System.out.println("Check the avilablity of the item(true or false)");
      item = sc.nextBoolean();
    System.out.println("Enter the item cost");
      item_Cost = sc.nextDouble();
    if(item = false){
      System.out.println("Sorry!Try again later");
    }
    else if(item = true && item_Cost<=Funds){
      System.out.println("Transaction will be proccesed");
    }
    else{
      System.out.println("Insufficient balance please add enough Funds");
    }
  }
}
  