import java.util.Scanner;
class InsertionArray{
  public static void main(String args[]){
    int n=5,i;
    int a[]=new int[n+1];
    Scanner sc=new Scanner(System.in);
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    int pos=2,newValue=20;
    for(i=(n-1);i>(pos-1);i--){
      a[i+1]=a[i];
    }
    a[pos-1]=newValue;
    System.out.println("after insertion");
    for(int j=0;j<a.length;j++){
      System.out.println("a["+j+"]="+a[j]);
    }
  }
}