import java.util.*;
class ArrayList{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(143);
    list.add("Neha");
    list.add(45.89f);
    System.out.println(list);
    for( Object obj:list){
      System.out.println(obj);
    }
      
  }
}