import java.util.HashSet;
class ExtractElement{
  public static void main(String args[]){
    HashSet<String> set=new HashSet<String>();
    set.add("red");
    set.add("yellow");
    set.add("green");
    set.add("violet");
    set.add("violet");
    set.add("pink");
    System.out.println(set);
  }
}