package StringFunctions;

import java.util.Date;

public class DateClass_PresentTime
{
public static void main(String[] args) 
{
	Date d1=new Date();
	System.out.println("The present time is "+d1);
	String date=d1.toString();
	System.out.println("The present time converted to string: "+date);
	}

}
