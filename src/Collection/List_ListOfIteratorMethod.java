package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class List_ListOfIteratorMethod 
	{
	public static void main(String[] args) 
	{
		List a1=new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);
		ListIterator i2= a1.listIterator();
		
		System.out.println("Elements traversed in forward direction");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Elements traversed in backward direction");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
