import java.util.*;
class Book{
  private String name,publisher,author;
  private int bnum;

  Book(String name,String publisher,String author,int bnum){
    setTitle(name);
    setAuthor(author);
    setPublisher(publisher);
    setBnum(bnum);
  }
  
  void setTitle(String name){
    this.name=name;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  void setAuthor(String author){
    this.author=author;
  }
  void setBnum(int bnum){
    this.bnum=bnum;
  }
  String getTitle(){
    return this.name;
  }
    String getPub(){
    return this.publisher;
  }
    String getAuthor(){
    return this.author;
  }
  int getBnum(){
    return this.bnum;
  }
  
  
}

public class  Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Book> b=new ArrayList<Book>();
    System.out.println("enter 5 book details");
    for(int i=0;i<5;i++){
      b.add(new Book(sc.next(),sc.next(),sc.next(),sc.nextInt()));
    
    
  }
    for (Book books:b){
      System.out.println(books.getTitle()+" "+books.getAuthor()+" "+books.getPub()+" "+books.getBnum());
    }
}
}