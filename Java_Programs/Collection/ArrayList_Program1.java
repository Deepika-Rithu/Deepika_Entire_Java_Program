package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_Program1 
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
		a1.remove(0);                   //removes the element at index 0
		System.out.println(a1);
		a1.remove("Ram");              //Removes Ram from a1
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();    //created ArrayList a2
		a2.addAll(a1);                   //adds ArrayList a1 to a2
		System.out.println(a2);
		a2.add(1, "Deepika");            //adds Deepika to a2 at index position 1
		System.out.println(a2);
		a2.addAll(0, a1);                //adds a1 to a2 at index 0
		System.out.println(a2);
		a2.removeAll(a1);                  //Removes  all the a1 object elements from a2
		System.out.println(a2);
		
		a1.clear();                     //clears a1
		System.out.println(a1);
		
		boolean ans=a1.isEmpty();       //checks whether a1 is empty
		System.out.println(ans);
		
		ArrayList a3=new ArrayList();
		a3=(ArrayList) a1.clone();         //generates clone of a1 in a3
		System.out.println(a3);
		
		System.out.println(a3.contains("Sita"));       //checks whether a3 contains the given object
		
		System.out.println(a3.size());
		
			}
}
