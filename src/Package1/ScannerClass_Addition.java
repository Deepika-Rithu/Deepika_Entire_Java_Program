package Package1;
import java.util.Scanner;

public class ScannerClass_Addition 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		s1.close();
		int sum=a+b;
		System.out.println(sum);
		

	}

}
