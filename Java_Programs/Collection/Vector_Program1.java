package Collection;
import java.util.Vector;
public class Vector_Program1
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(35);     //adds element to Vector
		v1.add("Ram");
		v1.addElement('h');  //adds element to Vector
		v1.addElement(-34);
		v1.addElement(45.867);
		System.out.println(v1);
		System.out.println(v1.firstElement());  //gives the first element
		System.out.println(v1.lastElement());    //gives the last element
		System.out.println(v1.capacity());       //gives the size of vector
		v1.removeElement(35);      //removes object 35 from the vector
		System.out.println(v1);
		v1.removeElementAt(1);    //removes the element at index 1
		System.out.println(v1);
		v1.removeAllElements();   //removes all the elements
		System.out.println(v1);
	}

}
