import java.util.Scanner;
class PosNegArray{
  public static void main(String args[]){
    int a[]={1,2,-4,-9,3};
    int pos=0,neg=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>=0){
        pos++;
      }
      else{
        neg++;
      }
    }
    System.out.println("Positive values are"+pos);
    System.out.println("Positive values are"+neg);
  }
}