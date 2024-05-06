package Array;

public class Average_Of_Two_Arrays 
{
	static int sum1=0;
	static double sum2=0;
	static double average=0;
	public static void main(String[] args)
	{
		int[] array1=new int[4];
		double[] array2=new double[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=15;
		array2[0]=23.47;
		array2[1]=24.89;
		array2[2]=25.65;
		array2[3]=26.90;
		for (int i=0;i<array1.length;i++)
		{
			sum1=sum1+array1[i];
		}
		for (int j=0;j<array2.length;j++)
		{
			sum2=sum2+array2[j];
		}
		average=(sum1+sum2)/8;
		System.out.println("The sum of numbers is "+(sum1+sum2));
		System.out.println("The average of numbers is "+average);
	}
}
