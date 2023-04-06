 import java.io.FileOutputStream;
import java.io.FileWriter;
class FileWritterDemo{
  public static void main(String args[]) {
    try{
      FileOutputStream fw=new FileOutputStream("a1.txt");
      String str="Thursday";
      fw.write(bytes);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
