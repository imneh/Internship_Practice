import java.util.Scanner;
class  WhileAsciiAtoZ{
  public static void main(String args[]) {
    char i = 'A';
    while (i <= 'Z') {
      System.out.println((int)i);
      i--;
    }
  }
}