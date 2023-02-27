import java.util.Scanner;
class TwoDReadDisplay{
  public static void main(String args[]){
   int a[][]=new int[3][2];
    Scanner sc=new Scanner(System.in);
    //reading
    System.out.println("enter elements");
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
      }
    }
    //displaying
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
    System.out.print(a[i][j]+" ");    
      } 
      System.out.println();
    }
 
  }
}