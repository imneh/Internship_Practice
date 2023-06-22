/*Write a program that prompts the user to enter a phone number. The program should validate the phone number based on the following criteria:
The phone number must contain only digits (0-9).
The phone number must be 10 digits long.*/
import java.util.*;
class PhoneNumberVerification{
  static void displayPhoneNumberVerification(String num){
    if(num.length()==10){
      int count=0;
      if(num.startsWith("7") || num.startsWith("8") || num.startsWith("9")){
      for(int i=0; i<num.length(); i++){
        if(num.charAt(i)>='0' && num.charAt(i)<='9'){
          count++;
        }
      }
      }
      else {
        System.out.println("please enter 10 digits phoone number starts with \"7\" , \"8\" and \"9\" ");
      }
      if(count==10){
        System.out.println(num + " is a valid phone number");
      }
      else {
        System.out.println(num + " is a Invalid phone number");
      }
    }
    else {
      System.out.println("please enter 10 digit phone number");
    }
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Phone Number");
    String num=sc.nextLine();
    displayPhoneNumberVerification(num);
  }
}