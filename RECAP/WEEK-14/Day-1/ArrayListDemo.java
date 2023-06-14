import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    ArrayList a=new ArrayList();
    a.add("Hello");
    a.add(10);
    System.out.println(a);
    Iterator itr=a.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    for(Object o:a){
      System.out.println(o);
    }
    for(int i=0;i<a.size();i++){
      System.out.println(a.get(i));
    }
  }
}