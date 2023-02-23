import java.util.Scanner;
class CountVowelArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      char arr[]=new char[5];
    System.out.println("Enter Array values");
    for(int i=0;i<5;i++){
      arr[i]=sc.next().charAt(0);
    }
    int count=0;
    System.out.println("Vowels are:");
    for(int i=0;i<5;i++)
      switch(arr[i]){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          count++;
      }
    System.out.println("Countof vowel="+count);
  }
}