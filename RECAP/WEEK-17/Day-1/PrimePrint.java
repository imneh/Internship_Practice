import java.util.*;

class PrimePrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter till which number to find prime ");
    int end = sc.nextInt();

    for (int i = 3; i <= end; i++) {
      boolean isPrime = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.print(i + " ");
      }
    }

  }
}