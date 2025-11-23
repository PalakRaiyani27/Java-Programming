import java.util.*;

class StudentInfo{
	String studPRN;
	String studname;
	String	studgender;
	String studcontactno;

	//parameterized constructor
	StudentInfo(String prn, String name ,String gender , String contact){
		studPRN= prn;
		studname =name;
		studgender = gender;
		studcontactno= contact;
	}

	void display(){
	System.out.println("student PRN : " + studPRN);
	System.out.println("student name : " + studname);
	System.out.println("student gender : " + studgender);
	System.out.println("student contact no: " + studcontactno);
	}

}

class StudentERP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student PRN:");
		String prn = sc.nextLine();
		System.out.print("Enter Student name:");
		String name = sc.nextLine();
		System.out.print("Enter Student gender:");
		String gender = sc.nextLine();
		System.out.print("Enter Student contact no:");
		String contactno = sc.nextLine();

	StudentInfo student = new StudentInfo(prn, name, gender , contactno);

	System.out.println("\n ---Student Information ---");
	student.display();


	}

}