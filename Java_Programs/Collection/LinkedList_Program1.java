package Collection;

import java.util.LinkedList;

public class LinkedList_Program1 {

	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(21);
		l1.add(321);
		l1.add(22);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		l1.addFirst(11);
		System.out.println(l1);
		l1.addLast(222);
		System.out.println(l1);
		l1.offerFirst(111);
		System.out.println(l1);
		l1.offerLast(1111);
		System.out.println(l1);
		System.out.println("Poll First "+l1.pollFirst());
		System.out.println("Poll Last "+l1.pollLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1);
	}

}
