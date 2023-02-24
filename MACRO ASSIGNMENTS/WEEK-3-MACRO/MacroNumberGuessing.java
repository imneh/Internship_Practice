 //1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
import java.util.Scanner;
import java.util.Random;
class MacroNumberGuessing{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Random ran=new Random();
  System.out.println("Enter the number");
  int guess=sc.nextInt();
  int randomNum=ran.nextInt(100);
  System.out.println(randomNum);
  while(true){
    if(guess!=randomNum){
      System.out.println("Guessed number is not correct!!! Enter again");
      guess=sc.nextInt();
      System.out.println(randomNum);
    }
    else{
      System.out.println("Guessed number is correct");
      break;
    }
  }  
}
}