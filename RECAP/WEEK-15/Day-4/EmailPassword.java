import java.util.*;
class InvalidLoginException extends Exception
{
  public InvalidLoginException (String str)
  {
    super(str);
  }
}
 class EmailPassword
  {
    static void login(String a,String b) throws InvalidLoginException
    {
      if(a.matches(b))
      {
        System.out.println("LOGIN SUCCESSFULLY");
      }
      else
      {
        throw new InvalidLoginException("TRY AGAIN LATER");
      }
    }
    public static void main(String args[])
    {
      String user="Neha";
      String pass="pass@123";
      try
      {
      login(user,pass);
      }
      catch(InvalidLoginException e)
        {
          System.out.println(e);
        }
     }
  }