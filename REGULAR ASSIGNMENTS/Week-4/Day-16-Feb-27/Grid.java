//First line of the input is an integer N that gives the number of rows and columns of the grid.
//Next N lines will have the board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
import java.util.Scanner;
class Grid{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of row");
   int n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]>10 || a[i][j]!=20){
          count++;
          break;
        }
      }
    }
    if(count==0)
      System.out.println("Yes");
    else
      System.out.println("no");
  }
}