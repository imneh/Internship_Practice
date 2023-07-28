package JDBCDemo.JDBCConnect;
import java.sql.*;
public class App 
{
	static void dbconnect(Connection con )
	{
    		if(con!=null)
    		{
    			System.out.println("CONNECTION SUCCESSFUL "+con);
    		}
    		else
    		{
    			System.out.println("UNSUCCESSFUL CONNECTION ");
    		}
    }
	static void addData(Connection con )throws SQLException
	{
		Statement stmt=con.createStatement();
		String sql="insert into employees values(205,'Eva','Nick',20,'2023-12-17','20,000')";
		int i=stmt.executeUpdate(sql);
        if(i>0) 
        {
            System.out.println("inserted");
        }
        else 
        {
            System.out.println("not inserted");
        }
	}
	static void updateData(Connection con) throws SQLException
	{
		Statement stmt=con.createStatement();
		String sql="update employees set first_name='Messi' where employee_id=121";
		int i=stmt.executeUpdate(sql);
        if(i>0) 
        {
            System.out.println("UPDATED");
        }
        else 
        {
            System.out.println("NOT UPDATED");
        }
	}
	static void deleteData(Connection con) throws SQLException
	{
		Statement stmt=con.createStatement();
		String sql="delete from employees where employee_id=201";
		int i=stmt.executeUpdate(sql);
        if(i>0) 
        {
            System.out.println("DELETED");
        }
        else 
        {
            System.out.println("DELETED");
        }
	}
    public static void main( String[] args ) throws ClassNotFoundException
    {
    try
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","NehaS@10");
        dbconnect(con);
        addData(con);
        updateData(con);
        deleteData(con);
    }
    catch(Exception e)
	{
    System.out.println( "e" );
}
}
 }