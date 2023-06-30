import java.util.Scanner;

class Frequency {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int size = scanner.nextInt();

    int[] array = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }

    int[] elementArray = new int[array.length];
    int[] frequencyArray = new int[array.length];
    int count = 0;

    for (int i = 0; i < array.length; i++) {
      int element = array[i];
      boolean isDuplicate = false;

      for (int j = 0; j < count; j++) {
        if (element == elementArray[j]) {
          isDuplicate = true;
          break;
        }
      }

      if (!isDuplicate) {
        elementArray[count] = element;
        frequencyArray[count] = 1;
        count++;
      } else {
        int index = 0;
        while (element != elementArray[index]) {
          index++;
        }
        frequencyArray[index]++;
      }
    }

    System.out.println("Frequency of elements in the array:");
    for (int i = 0; i < count; i++) {
      System.out.println("Element " + elementArray[i] + " occurs " + frequencyArray[i] + " times.");
    }
  }
}
