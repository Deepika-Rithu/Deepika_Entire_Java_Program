package Array;

public class Find_Average
{
	static int sum=0;
	static double average=0;
	public static void main(String[] args)
	{
		int[] nos=new int[4];
		nos[0]=14;
		nos[1]=15;
		nos[2]=57;
		nos[3]=90;
		for(int i=0;i<nos.length;i++)
		{
			sum=sum+nos[i];
			average=sum/4;
		}
			System.out.println("The sum of numbers is "+sum);
		System.out.println("The average of numbers is "+average);
	}
}
