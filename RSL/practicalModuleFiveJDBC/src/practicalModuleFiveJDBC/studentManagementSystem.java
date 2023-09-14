package practicalModuleFiveJDBC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;


class studentManagement
{
//	String url = "jdbc:mysql://localhost:3306/";//this url is used when no database is created.
	String url = "jdbc:mysql://localhost:3306/student_db"; // we use database name here
	String username = "root";
	String password = "Gaurimysql@123";
	/*public void createDB()
	{
		try
		{
			String qur = "create database student_db";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement  ps = con.prepareStatement(qur);
			ps.execute();
			System.out.println("Database is created.. ");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}*/
	
	/*public void createTable()
	{
		try
		{
			String qur = "create table student(id int, name varchar(20), age int, grade float)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement  ps = con.prepareStatement(qur);
			ps.execute();
			System.out.println("table is created.. ");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}*/
	
	public void addStudent() throws IOException
	{
		String qur = "insert into student(id,name,age,grade)values(?,?,?,?)";
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id of Student: ");
		int id = sc.nextInt();
		System.out.println("Enter name of Student: ");
		String name = br.readLine();
		System.out.println("Enter age of Student: ");
		int age = sc.nextInt();
		System.out.println("Enter grade of Student  in(%): ");
		double grade = sc.nextDouble();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement  ps = con.prepareStatement(qur);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setDouble(4, grade);
			int count = ps.executeUpdate();
			if(count>0)
			{
				System.out.println("data inserted successfully...");
			}
			else
			{
				System.out.println("Error..");
			}
			
			con.close();
			ps.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteStudent()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement smt = con.createStatement();
			System.out.println("Enter id of user to delete record: ");
			int id = sc.nextInt();
			String qur = "delete from student where id = '"+id+"'";
			smt.executeUpdate(qur);
			System.out.println("record is deleted successfully");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void ShowStudentData()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter id of user to access record: ");
			int id = sc.nextInt();
			
			String qur = "select * from student where id = '"+id+"'";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(qur);
			if(rs.next())
			{
				System.out.println("Student id: " + rs.getInt(1));
				System.out.println("Student name: " + rs.getString(2));
				System.out.println("Student age: " + rs.getInt(3));
				System.out.println("Student grade: " + rs.getDouble(4));
			}
			else
			{
				System.out.println("Can't find record");
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void updateStudentData()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Enter id of user to update record: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter updated name: ");
			String name = sc.nextLine();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter grade: ");
			double grade = sc.nextDouble();
			
			String qur = "update student set name= ?, age = ?, grade = ? where id =?";
			PreparedStatement ps = con.prepareStatement(qur);

			
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setDouble(3, grade);
			ps.setInt(4, id);
			int count = ps.executeUpdate();

			if(count>0)
			{
				System.out.println("Data updated successfully");
			}
			else
				System.out.println("can't find data");
			
			
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

public class studentManagementSystem 
{
	public static void main(String args[]) throws IOException
	{
		studentManagement sm = new studentManagement();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Student Management System \n1. Add Data \n2. Delete Data \n3. Update data \n4. Show Data \n5. Exit");
			int choice = sc.nextInt();
			switch(choice)
				{
					case 1:
						sm.addStudent();
						break;
						
					case 2:
						sm.deleteStudent();
						break;
					case 3:
						sm.updateStudentData();
						break;
					case 4:
						sm.ShowStudentData();
						break;
					case 5:
						System.exit(0);
				}	
		}
	}
}
