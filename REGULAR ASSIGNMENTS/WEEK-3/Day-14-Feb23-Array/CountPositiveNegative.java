import java.util.Scanner;
class CountPositiveNegative{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array value");
    double arr[]=new double[5];
    for(int i=0;i<5;i++){
      arr[i]=sc.nextDouble();
    }
    int countp=0;
    int countn=0;
    for(int i=0;i<5;i++){
      if(arr[i]>0)
        countp++;
      else
        countn++;
      }
    System.out.println("Count of Positive number="+countp);
    System.out.println("Count of Negative number="+countn);
    }
    
  }
}