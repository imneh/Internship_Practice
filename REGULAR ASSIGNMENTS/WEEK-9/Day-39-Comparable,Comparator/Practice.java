import java.util.ArrayList;
class Practice{
  public static void main(String ags[]){
    ArrayList<Object>list=new ArrayList<Object>();

    list.add("Hello");
    list.add(43);
    list.add(3.14);
    list.add(true);
    list.add('a');

  for(Object element:list){
    System.out.println(element);
  }
  }
}