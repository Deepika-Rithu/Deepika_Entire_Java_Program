package Assertion;

public class Assertion_In_Array 
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum=sum+numbers[i];
        }
        assert sum > 10 : "Sum should be greater than 10";

        System.out.println("Sum of numbers: " + sum);
	}
}
