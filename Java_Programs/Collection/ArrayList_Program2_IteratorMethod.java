package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Program2_IteratorMethod 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();  //created ArrayList a1
		a1.add("Ram");
		a1.add(true);
		a1.add('h');
		a1.add(25);
		a1.add(23.855);
		System.out.println(a1);
		
		Iterator i1=a1.iterator();     //Iterator method
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
