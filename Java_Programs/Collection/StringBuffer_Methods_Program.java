package Collection;
public class StringBuffer_Methods_Program
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Hello");
		s1.append(" World");
		System.out.println(s1);
		s1.insert(6, "dear ");
		System.out.println(s1);
		s1.replace(6, 10, "my");
		System.out.println(s1);
		s1.delete(6, 8);
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s1.substring(7, 12));
		System.out.println(s1.toString());
		System.out.println(s1.capacity());
		System.out.println(s1.reverse());
			}

}
