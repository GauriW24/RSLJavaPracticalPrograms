package practicalModuleTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class practicalNineteen 
{

	String url = "jdbc:mysql://localhost:3306/";
	String username = "root";
	String password = "Gaurimysql@123";
	public void createDatabase()
	{
		try
		{
			String qur = "create database Student";
			//using forName we can register a driver.
			//com.mysql.cj.jdbc.Driver is a driver class for mysql database.
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username, password);
			PreparedStatement ps = con.prepareStatement(qur);
			ps.execute();
			System.out.println("database is created...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		practicalNineteen pn = new practicalNineteen();
		pn.createDatabase();
	}


}
