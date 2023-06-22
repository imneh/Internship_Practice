class Stringfirst{
  public static void main(String args[]){
    String word="Neha";
    char search='e';
    int index=0;
    char w[]=word.toCharArray();
    for(int i=0;i<w.length;i++){
      if(w[i]==search)
      {
        index=i;
      }

    }
    System.out.println(index);

  }
}