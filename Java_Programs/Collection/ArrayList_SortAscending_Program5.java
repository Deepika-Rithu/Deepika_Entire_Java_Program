package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortAscending_Program5 
{
	public static void main(String[] args) 
	{
	 ArrayList a1=new ArrayList();
	 a1.add("Kavya");
	 a1.add("Deepika");
	 a1.add("Divya");
	 a1.add("Arthy");
	 a1.add("Babu");
	 System.out.println("Before Sorting: "+a1);
	 Collections.sort(a1);
	 System.out.println("After Sorting: "+a1);
	}

}
