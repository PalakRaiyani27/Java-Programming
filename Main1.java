import java.util.*;

 class Student1
{
	String name;
	int rollno;
}

 class Marks extends Student1
{
	int javaTheory;
	int javaPractical;
	int Total;

	void SetMarks(int javaTheory, int  javaPractical)
	{
		this.javaTheory=javaTheory;
		this.javaPractical=javaPractical;
		this.Total=javaTheory + javaPractical;
	}

	void display()
	{
		System.out.println("Name:" + name);
		System.out.println("Roll No:" + rollno);
		System.out.println("Java Theory:" + javaTheory);
		System.out.println( "Java Practical:"+ javaPractical);
		System.out.println("Total:" + Total);
	}

}

public class Main1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		Marks student = new Marks();
		
		System.out.print("Enter Name:");
		student.name = sc.nextLine();

		System.out.print("Enter roll no:");
		student.rollno = sc.nextInt();

		System.out.print("Enter java theory marks:");
		int javaTheory = sc.nextInt();

		System.out.print("Enter java practical marks:");
		int javaPractical = sc.nextInt();
		
		student.SetMarks(javaTheory,javaPractical);
		System.out.println("-----------------Student Details--------------------");
		student.display();
				
		
	}

}
