import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
class AgeCalculator{
  public static void main(String args[]){
    System.out.println("Enter the date of birth:");
    Scanner sc=new Scanner(System.in);
    String birthDate;
    birthDate=sc.next(); 
  LocalDate today=LocalDate.now();
    System.out.println(today);
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateOfBirth = LocalDate.parse(birthDate, dateFormat);
    Period age=Period.between(dateOfBirth,today);
    System.out.println(age.getYears());
     if(age.getYears()>=18){
        System.out.println("Adult");
      }
      else{
        System.out.println("minor");
      }
    }
  }