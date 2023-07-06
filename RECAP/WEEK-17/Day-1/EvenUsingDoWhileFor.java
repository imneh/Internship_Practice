import java.util.*;
class EvenUsingDoWhileFor {
  static void ForLoop() {
    System.out.println("Even numbers using for loop");
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  static void whileLoop() {
    System.out.println("Even numbers using while loop");
    int i = 0;
    while (i <= 100) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    }
  }

  static void DoWhileLoop() {
    System.out.println("Even numbers using Do while loop");
    int i = 0;
    do {
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    } while (i <= 100);
  }

  public static void main(String args[]) {
    ForLoop();
    whileLoop();
    DoWhileLoop();
  }
}
