package Array;

import java.util.Arrays;

public class Check_Number_Present_In_Array
{
	static int count=0;
	public static void main(String[] args)
	{
		int nos[]=new int[4];
		nos[0]=78;
		nos[1]=57;
		nos[2]=41;
		nos[3]=41;
		System.out.println(Arrays.toString(nos));
		for(int i=0;i<nos.length;i++)
		{
			if(nos[i]==41)
			{
				System.out.println("The given number is present at the index position "+i);
				count++;
			}
			else
			{
				System.out.println("The given number is not present at the index position "+i);
			}
		}
		System.out.println("The given number is present "+count+" times in the array");
	}

}
