import java.util.Scanner;
class MapDemo2{
  public static void main(String args[]){
    HashMap<Integer,String>map=new HashMap<Integer,String>();
    map.put(222,"Neha");
    map.put(232,"amulya");
    map.put(242,"Salman");
    map.putIfAbsent(221, "siraaj");
    map.putIfAbsent(220, "shaheed");
    System.out.println(map);
  for(Map.Entry m:map.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
  }
  }
}