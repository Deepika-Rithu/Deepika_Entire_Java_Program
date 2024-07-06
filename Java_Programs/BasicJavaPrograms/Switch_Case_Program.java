package Package1;

import java.util.Scanner;

public class Switch_Case_Program
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the switch value");
		int n=s1.nextInt();
		s1.close();
		switch(n)
		{
		case 1:
			System.out.println("Launch Chrome Browser");
			break;
		case 2:
			System.out.println("Launch Firefox Browser");
			break;
		case 3:
			System.out.println("Launch Edge Browser");
			break;
		case 4:
			System.out.println("Launch Safari Browser");
			
		case 5:
			System.out.println("Launch Opera Browser");
			
		default:
			System.out.println("Invalid input");
				
		}

	}

}
