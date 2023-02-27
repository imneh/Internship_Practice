import java.util.Scanner;
class TwoD{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]={{11,42,62},{13,45,67},{10,34,89}};
    for (int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a[i][j]+"");  
      }
        System.out.println();
    } 
    System.out.println(a[0][1]);
  }
}