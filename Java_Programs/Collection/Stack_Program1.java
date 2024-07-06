package Collection;

import java.util.Stack;

public class Stack_Program1 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		s1.add(35);   
		s1.add("Ram");
		s1.addElement('h'); 
		s1.addElement(-34);
		s1.addElement(45.867);
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		s1.push("new");
		System.out.println(s1);
	}

}
