package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet_Program
{
	public static void main(String[] args) 
	{
		List a1=new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);  //List follows indexing and order of insertion
		a1.add("pen");           //Duplicate values can be added in list
		System.out.println(a1);  
		a1.add(null);            //List accepts any number of null values
		a1.add(null);
		System.out.println(a1);
		
		Set a2=new HashSet();
		a2.add("pen");
		a2.add("pencil");
		a2.add("box");
		a2.add("bottle");
		System.out.println(a2);  //Set does not follow indexing and order of insertion. It follows hashcode value
		a2.add("pen");           //Duplicate values cannot be added in set
		System.out.println(a2);  
		a2.add(null);            //Set accepts only one null value not more than that
		a2.add(null);
		System.out.println(a2);
	}

}
