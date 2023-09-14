package practicalModuleFour;
import java.util.*;
class student
{
	String name;
	double grade;
	student(String n, double g)
	{
		name = n;
		grade = g;
	}
	public String getName()
	{
		return name;
	}
	public double getGpa()
	{
		return grade;
	}
}
class course 
{
	String courseName;
	ArrayList<student> enrolledStudent;
	
	public course(String cn) 
	{
		courseName = cn;
		enrolledStudent = new ArrayList<>();
	}
	public String getCName()
	{
		return courseName;
	}
	public ArrayList<student> getEnrolledStudents()
	{
		return enrolledStudent;
	
	}
	 public void enrollStudents(student stud) 
	 {
	        enrolledStudent.add(stud);
	 }
	 public void dropStudent(student stud) 
	 {
	        enrolledStudent.remove(stud);
	 }
	 public double calculateAverageGpa() 
	 {
	        if (enrolledStudent.isEmpty()) 
	        {
	            return 0.0;
	        }
	        double totalGpa = 0.0;
	        for (student student : enrolledStudent) {
	            totalGpa += student.getGpa();
	        }

	        return totalGpa / enrolledStudent.size();
	    }
}

public class taskFive
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		student s1 = new student("Gauri Wadekar", 3.8);
		student s2 = new student("Aditya Wadekar", 4.0);
		student s3 = new student("Neha patil", 3.5);
		student s4 = new student("Aastha desai", 2.5);
		course c1 = new course("Java programming");
		c1.enrollStudents(s1);
		c1.enrollStudents(s2);
		c1.enrollStudents(s3);
		c1.enrollStudents(s4);
		
		double gpa = c1.calculateAverageGpa();
		System.out.println(gpa);
		
		c1.dropStudent(s3);
		
		double gpa1 = c1.calculateAverageGpa();
		System.out.println(gpa1);
		
	}
		
}
