class InvalidUsernameException extends Exception {
  public InvalidUsernameException(String str) {
    super(str);
  }
}

public class CustomEx {
  static void validateUsername(String name) throws InvalidUsernameException {// method signature
    if (name.contains("@")) {
      System.out.println("Valid Username");
    } else {
      throw new InvalidUsernameException("Invalid Username");
    }
  }

}

  public static void main(String args[]){
    String str="ABCD";
    try{
      validateUsername(username);
    }  
  }
