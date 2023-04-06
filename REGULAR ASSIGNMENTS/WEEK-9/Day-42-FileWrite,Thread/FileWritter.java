import java.io.FileWriter;
class FileWritter{
  public static void main(String args[]) {
    try{
      FileWriter fw=new FileWriter("a.txt");
      fw.write("Hi");
      fw.close();
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}