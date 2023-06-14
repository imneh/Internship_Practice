class invalidUsernameException extends Exception {
  invalidUsernameException(String str) {
    super(str);
  }
}

class checkUsername {
  void validateUsername(String username) throws InvalidUsernameException {
    if (!username.matches("[a-zA-Z0-9]+")) {
      throw new InvalidUsernameException(" invalid characters");
    }
    if (username.length() < 5 || username.length() > 12) {
      throw new InvalidUsernameException("length should be between 5 and 12 characters");
    } else {
      throw new invalidUsernameExceptionion("Invalid Username ");
    }
  }
}

class ExceptionUserName {
  public static void main(String args) {
    checkUsername num = new checkUsername();
    try {
      num.validateUsername("Neha@125");
    } catch (invalidUsernameExceptionon e) {
      System.out.println(e);
    }
  }
}