package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortAscending_Program4 {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(15);
		a1.add(76);
		a1.add(900);
		a1.add(-120);
		a1.add(65);
		a1.add(23);
		System.out.println("Before Sorting: "+a1);
		Collections.sort(a1);
		System.out.println("After Sorting: "+a1);
	}

}
