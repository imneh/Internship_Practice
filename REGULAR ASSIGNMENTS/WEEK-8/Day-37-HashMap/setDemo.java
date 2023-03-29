import java.util.LinkedHashSet;
// cannot insert duplicates
class SetDemo{
  public static void main(String args[]){
    LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
    s.add(10);
    s.add(20);
    s.add(20);
    s.add(10);
    System.out.println(s);
  }
}