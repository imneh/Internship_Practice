import java.util.*;
class NameValid
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      boolean valid=true;
      do{
         System.out.println("Enter the name");
      String name=sc.next();
        if(name.length()>5){
          System.out.println("valid name");
          valid=false;    
        }
        else{
          System.out.println("Invalid name and again enter");
        }
      }while(valid); 
    }  
  }