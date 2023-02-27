import java.util.Scanner;
class EvenCountTwoD{
  public static void main(String args[]){
    int a[][]={{12,45,67},{34,5,7},{12,67,89}};
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]%2==0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
   