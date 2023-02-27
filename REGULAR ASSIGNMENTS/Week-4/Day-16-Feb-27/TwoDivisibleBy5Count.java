import java.util.Scanner;
  class TwoDivisibleBy5{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{2,5,15},{20,60,70},{4,5,6}};
      for(int i=0;i<3;i++){
        int count=0;
        for(int j=0;j<3;j++){
          if(a[i][j]%5==0){
           count++;
          }
        }
        System.out.println(count);
       
      }
    }
  }