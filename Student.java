import java.util.*;

public class Student
{
	String name;
	int rollno;

	Student(String name , int rollno)
	{
		this.name = name;
		this.rollno= rollno;
	}
	
	void display()
	{
		System.out.println("Name:" + name + ", Roll no " + rollno);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name:");
		String name= sc.nextLine();
	
		System.out.print("Enter the roll no:");
		int rollno= sc.nextInt();
	
		Student s1 = new Student(name,rollno);
		s1.display();


	}

}