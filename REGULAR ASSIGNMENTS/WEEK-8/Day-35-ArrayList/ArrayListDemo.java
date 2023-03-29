import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    List<Float> list=new ArrayList<Float>();
    Scanner sc=new Scanner(System.in);
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    System.out.println(list);
    for(Float i:list)
    {
      System.out.println(i);
    } 
  }
}