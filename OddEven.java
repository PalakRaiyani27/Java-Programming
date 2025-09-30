import java.util.*;

public class OddEven
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter The Number:");
		int num = sc.nextInt();
		
		if(num % 2 ==0)
		{
			System.out.print("It's Even Number");
		}else{
			System.out.print("It's Odd Number");
		}	
	
	}
}