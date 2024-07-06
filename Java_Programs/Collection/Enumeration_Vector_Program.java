package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Vector_Program 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(10);
		v1.add("Deepika");
		v1.add(23.56);
		System.out.println(v1);
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
