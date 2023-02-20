import java.util.Scanner;
class DivisibleBy5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i=0;
    while (i<= 100) {
      if (i % 5 == 0)
        System.out.println(i);
      i = i + 1;
    }
      System.out.println("exit");
  }
}
