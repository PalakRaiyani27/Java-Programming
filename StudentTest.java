//Define a class StudentInfo with parameters std_prn, std_name, std_address, and std_gender. Use a parameterized constructor to accept these values from the //user using Scanner and display all student information.

import java.util.*;

class StudentInfo
{
	int std_prn;
	String std_name;
	String	std_address;
	char std_gender;

	//parameterized constructor
	StudentInfo(int prn , String name , String address , char gender)
	{
		this.std_prn = prn;
		this.std_name = name;
		this.std_address = address;
		this.std_gender = gender;
	}

	//method to display student details
	void display(){
		System.out.println("--------------Student Details--------------");
		System.out.println("PRN : "  + std_prn );
		System.out.println("Name :" + std_name);
		System.out.println("Address : "+ std_address );
		System.out.println("Gender :" + std_gender);
	}
}

//main class
public class StudentTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//taking input from user 
		System.out.print("Enter Student PRN:");
		int prn = sc.nextInt();

		System.out.print("Enter Student Name: ");
		String name= sc.next();

		System.out.print("Enter Student Address : ");
		String address = sc.next();
	
		System.out.print("Enter Student Gender : ");
		char gender = sc.next().charAt(0);

//create student obj 
StudentInfo student = new StudentInfo(prn , name , address,gender);
student.display();
	

	}
}
















