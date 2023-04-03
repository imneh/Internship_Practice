import java.util.*;
class Rectangle implements Comparable<Rectangle>{
  double width,height;
  Rectangle(double width,double height){
    this.height=height;
    this.width=width;
  }
 double getArea(){
   return width*height;
 }
 double getPerimeter(){
   double p=2*(width+height);
   return p;
 }
  public int compareTo(Rectangle r){
    if(getPerimeter()>r.getPerimeter()){
      return -1;
    }
    else if(getPerimeter()<r.getPerimeter()){
      return 1;
    }
    else{
      return 0;
    }
  }
}
class AreaComparator implements Comparator<Rectangle>{
  public int compare(Rectangle r1,Rectangle r2){
    if(r1.getArea()>r2.getArea()){
      return -1;
    }
    else if(r1.getArea()<r2.getArea()){
      return 1;
    }
    else{
      return 0;
    }
  }
}
class ComparatorRectangle{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Rectangle> rect=new ArrayList<Rectangle>();
    for(int i=0;i<3;i++){
      rect.add(new Rectangle(s.nextDouble(),s.nextDouble()));
    }
    System.out.println("sorted based on area");
    Collections.sort(rect,new AreaComparator());
    for(Rectangle r:rect){
      System.out.println(r.height+"  "+r.width+" Area is "+r.getArea());
    }

 

    System.out.println("Sorted based on Perimeter");
    Collections.sort(rect);
    for(Rectangle r:rect){
      System.out.println(r.height+"  "+r.width+" perimeter is "+r.getPerimeter());
    }
  }
}