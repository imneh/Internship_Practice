class ExceptionDemo{
  public static void main(String args[]){
    int a[]={12,56,89,74};
    try{
       System.out.println(a[6]);//here the Exception is arrayOutofBounds declared 4 num but trying to access 6
    }
    catch(ArrayIndexOutOfExceptionException e){
      System.out.println(e);
    }   
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]+" ");
    }
  }
}