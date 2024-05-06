package Matches;

import java.util.Arrays;

public class Split {

	public static void main(String[] args)
	{
		String a1="My name is Deepika";
		String a2[]=a1.split(" ");
		String a3[]=a1.split("e");
		System.out.println(a1);
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
	}

}
