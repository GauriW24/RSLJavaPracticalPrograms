package practicalModuleTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class practicalTwenty 
{

	String url = "jdbc:mysql://localhost:3306/Student";
	String username = "root";
	String password = "Gaurimysql@123";
//	public void createTable()
//	{
//		try
//		{
//			String qur = "create table StudentInformation(name varchar(20), id int, address varchar(15))";
//			//using forName we can register a driver.
//			//com.mysql.cj.jdbc.Driver is a driver class for mysql database.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url,username, password);
//			PreparedStatement ps = con.prepareStatement(qur);
//			ps.execute();
//			System.out.println("Table is created...");
//			con.close();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//	}
	
//	public void insertIntoTable()
//	{
//		try
//		{
//			String qur = "insert into studentInformation (name, id, address) value('Gauri', 101, 'Pune');";
//			//using forName we can register a driver.
//			//com.mysql.cj.jdbc.Driver is a driver class for mysql database.
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url,username, password);
//			PreparedStatement ps = con.prepareStatement(qur);
//			ps.execute();
//			System.out.println("data inserted successfully...");
//			con.close();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//			
//		}
//	}
	
	
	public void retriveData()
	{
		try
		{
//			String qur = "";
			//using forName we can register a driver.
			//com.mysql.cj.jdbc.Driver is a driver class for mysql database.
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username, password);
			PreparedStatement ps = con.prepareStatement("select * from studentInformation");
			ps.execute();
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("Name: " + rs.getNString("name"));
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Address: " + rs.getNString("address"));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void main(String[] args)  
	
	{
		practicalTwenty pn = new practicalTwenty();
		pn.retriveData();
	}


}

