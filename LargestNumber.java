import java.util.*;

public class LargestNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num1:");
		int num1= sc.nextInt();

		System.out.print("Enter the num2:");
		int num2= sc.nextInt();

		System.out.print("Enter the num3:");
		int num3= sc.nextInt();

		//variable to store largest value.
		int largest; 
		
		if(num1 >= num2 && num1 >= num3)
		{
//It just stores the value of num1 into the variable largest.
			largest = num1;
		}
		else if(num2 >= num1 && num2 >= num3)
		{
			largest = num2;
		}
		else
		{
			largest =num3;	
		}

		System.out.println("Largest no is:" + largest);
	

	}
	

}
