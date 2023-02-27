// Input Format:
// First line of the input is an integer N that gives the number of rows and columns of the grid.
// Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
// Output Format:
// Output should display the highest valued number in the numbered cells.
// Refer sample input and output for formatting specifications.
 
// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 1:
// 6
 
// Sample Input 2:
// 5
// 20 20 20 20 4
// 1 20 20 20 20
// 20 20 20 20 20
// 20 2 20 20 20
// 20 20 20 20 20
 
// Sample Output 2:
// 4


import java.util.*;
class Grid4{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter number of rows");
    int n=sc.nextInt();
    int sum=0;
    System.out.println("enter number of columns");
    int m=sc.nextInt();
    int arr[][]=new int[n][m];
    int i,j,count=0;
    System.out.println("enter elements ");
    // reading elements
      for(i=0;i<n;i++){
      for (j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
        System.out.println();
    }
    int max=0;
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        if(arr[i][j]!=20){
          if(arr[i][j]>max){
            max=arr[i][j];
          }
        }
      }
    }
    System.out.println(max);
  }

}