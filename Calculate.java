import java.util.*;

public class Calculate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter operator:");
		char operator = sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			System.out.print("Answer is:"  + (a+b));
			break;
		case '-':
			System.out.print(a-b);
			break;
		case '*':
			System.out.print(a*b);
			break;
		case '/':
			System.out.print(a/b);
			break;
		case '%':
			System.out.print(a%b);
			break;
		default:
			System.out.println("wrong operator");

		}
				
	}
}