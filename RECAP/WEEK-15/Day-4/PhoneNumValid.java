import java.util.*;
class InvalidPhoneException extends Exception{
  public InvalidPhoneException( String str){
    super(str);
  }
}
class PhoneNumvalid{
  static boolean validate(String Phone) throws InvalidPhoneException{
    if(Phone.length()==10)
      return true;
    else 
       throw new InvalidPhoneException("Invalid Phone Number");
  }
  public static void main(String args[]){
    String Phoneno="98765432210";
    try{
      if(validate(Phoneno)){
        System.out.println("Valid");
      }
    }
    catch(InvalidPhoneException e){
      System.out.println(e);
    }
  }
}