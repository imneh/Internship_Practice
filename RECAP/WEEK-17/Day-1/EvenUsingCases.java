import java.util.Scanner;

class EvenUsingCases {
  static Scanner sc = new Scanner(System.in);

  static void menu() {
    int choice = 0;
    do {
      System.out.println("1 for Loop execution");
      System.out.println("2 while Loop execution");
      System.out.println("3 do while Loop execution");
      System.out.println("4 Exit");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          withForLoop();
        case 2:
          withwhileLoop();
        case 3:
          withDoWhileLoop();
        case 4:
          System.exit(0);
        default:
          System.out.println("invalid choice");
      }

    } while (choice != 4);
  }
}