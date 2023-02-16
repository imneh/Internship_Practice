//Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round
import java.util.Scanner;
class RockPaperScissor{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Select options Rock Paper Scissor:");
    String userChoice;
    String computerChoice;
    System.out.println("Enter user choice:");
    userChoice=sc.next();
    System.out.println("Enter Computer Choice:");
    computerChoice=sc.next();
    if(userChoice.equals("computerChoice")){
      System.out.println("Tie");
    }
    else if((userChoice.equals("Rock")&&computerChoice.equals("Paper"))||(userChoice.equals("Paper")&&computerChoice.equals("Scissor"))||(userChoice.equals("Scissor")&&computerChoice.equals("Rock"))){
    System.out.println("Computer wins:");
    }
    else if((computerChoice.equals("Rock")&&userChoice.equals("Paper"))||(computerChoice.equals("Paper")&&userChoice.equals("Scissor"))||(computerChoice.equals("Scissor")&&userChoice.equals("Rock"))){
    System.out.println("User wins:");
    }
    else{
      System.out.println("loosers");
    }
  }
}