package Array;
import java.util.Arrays;
public class Copy_Array_Reverse_Order
{
	public static void main(String[] args)
	{
	String names[]=new String[4];
	names[0]="Ram";
	names[1]="Sita";
	names[2]="Lakshmi";
	names[3]="Vishnu";
	String namescopy[]=new String[names.length];
	for(int i=names.length-1;i>=0;i--)
	{
		namescopy[i]=names[names.length-1-i];
	}
	//for(int i=0;i<names.length;i++)
	//{
	//	namescopy[names.length-1-i]=names[i];
	//}
	System.out.println("Original String");
	System.out.println(Arrays.toString(names));
	System.out.println("Copied String in reverse");
	System.out.println(Arrays.toString(namescopy));
	}
}
