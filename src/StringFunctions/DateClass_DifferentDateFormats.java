package StringFunctions;

import java.util.Date;

public class DateClass_DifferentDateFormats 
{
public static void main(String[] args) 
	{
	Date d1=new Date();
	System.out.println(d1);
	String date=d1.toString();
	System.out.println(date);
	String month=date.substring(4, 7);
	String day=date.substring(8, 10);
	String year=date.substring(date.length()-4);
	System.out.println(day.concat(" ").concat(month).concat(" ").concat(year));
	System.out.println(day.concat("-").concat(month).concat("-").concat(year));
	System.out.println(day.concat("/").concat(month).concat("/").concat(year));
	}

}
