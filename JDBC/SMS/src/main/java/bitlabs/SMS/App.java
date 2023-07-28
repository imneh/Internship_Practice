package bitlabs.SMS;

import java.sql.SQLException;

import com.bitlabs.dao.StudentDao;
import com.bitlabs.dao.StudentDaoImpl;
import com.bitlabs.entity.Student;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Student st=new Student(1,"neha",32,"n2002@gmail.com","SMG");
        
     	StudentDaoImpl dao=new StudentDaoImpl();
    	Scanner s=new Scanner(System.in);
    	System.out.println("Admin or user");
    	String input=s.next();
    	if(input.equalsIgnoreCase("admin")) {
    		System.out.println("1.Add student");
    		System.out.println("2.delete student by id");
    		System.out.println("3.update student by id");
    		System.out.println("4.display student");
    		System.out.println("Enter your choice");
         	int ch=s.nextInt();
         	switch(ch) {
         	case 1:dao.addStudent(st);
         	break;
         	case 2:dao.deleteStudentById(114);
         	break;
         	case 3:dao.updateStudentById(117, "dhoni");
         	break;
         	case 4:dao.getStudent();
         	break;
         	default:System.out.println("Invalid choice");
         	}
         	
    	}
    	else {
    		dao.getStudentById(113);
    	}
    	
    	    
        
    }
}