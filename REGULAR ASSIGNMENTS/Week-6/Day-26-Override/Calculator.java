class Sample{
  
  
  public void add(int num1,int num2){
    int res=num1+num2;
    System.out.println("the result is"+res);
  }
  public void add(double a,double b){
    
    double res=a+b;
    System.out.println("the result is"+res);
  }
  public void add(int a,int b,long c){
    long res=a+b+c;
    System.out.println("the result is"+res);
  }
}
class Calculator{
  public static void main(String args[]){
    Sample s=new Sample();
    s.add(1,2);
    s.add(2.5,4.6);
    s.add(1,2,3);
  }
}