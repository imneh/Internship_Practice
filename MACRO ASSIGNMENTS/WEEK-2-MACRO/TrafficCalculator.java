import java.util.Scanner;
class TrafficCalculator{
  public static void main(String args[]){
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the time : ");
    int time=sc.nextInt(); 
    System.out.println("enter the traffic flow : ");
    String trafficflow =sc.next();
    if((time>=8&&time<10)&&(trafficflow.equals("heavy"))){
     System.out.println("red light for east-west and green for north-south");
    }else if ((time>=10&&time<12)&&(trafficflow.equals("heavy"))){
      System.out.println("green light for east-west and red for north-south");
    }else if ((time>=12&&time<14)&&(trafficflow.equals("heavy"))){
      System.out.println("red light for east-west and green for north-south");
    }else if ((time>=14&&time<16)&&(trafficflow.equals("heavy"))){
      System.out.println("red light for east-west and green for north-south");
    }else
      System.out.println("yellow for alld directions");
    
    
  }
}