import java.util.Scanner;
class MapDemo3{
  public static void main(String args[]){
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    map.put(11,1234);
    map.put(10,3456);
    map.put(15,4567);
      if(map.containsValue(4589)){
        System.out.println("Found");
      }
    else{
      System.out.println("Not Found");
    }
  }
}
 