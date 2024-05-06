package Assertion;

public class Assertion_In_ForLoop
{
	public static void main(String[] args) 
	{
		int sum=0;
		double average=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			average=sum/10;
		}
		assert average<=5:"The average of the numbers is greater than 5";
		System.out.println("The average of the numbers is "+average);
	}

}
