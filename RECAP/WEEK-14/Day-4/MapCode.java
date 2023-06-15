import java.util.*;
class MapCode{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(20,"Neha");
    hm.put(21,"sall");
    hm.put(22,"siraj");
    hm.put(23,"all");
    hm.put(24,"kar");
    hm.put(25,"ammu");
    hm.put(null,"namaste");
    hm.put(null,"hey");
    
    System.out.println(hm);
    for(Map.Entry<Integer,String> o:hm.entrySet()){
      Sytem.out.println(o.getValue()+","+o.getKey());
      if(hm.containsValue("Neha")){
        int n="Neha".length();
        System.out.println(n);
      }
    }
  }
}
