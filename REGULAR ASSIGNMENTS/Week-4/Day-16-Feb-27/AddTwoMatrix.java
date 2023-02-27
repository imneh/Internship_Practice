import java.util.Scanner;
class AddTwoMatrix{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    int a[][]={{1,3,4},{2,4,6},{6,7,8}};
    int b[][]={{1,3,4},{2,4,6},{6,7,8}};
    int c[][]=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        c[i][j]=a[i][j]+b[i][j];
        System.out.println(c[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}