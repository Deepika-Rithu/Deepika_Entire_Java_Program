package StringFunctions;

import java.util.Date;

public class DateClass_PastTime_FutureTime 
{
public static void main(String[] args) 
	{
	Date d1=new Date();                  //to get the current date and time
	System.out.println(d1.getTime());     //gives epoch time of current date and time
	Date d2=new Date(d1.getTime());     //To convert epoch time to human understanding time
	System.out.println(d2);               //present time
	Date d3=new Date(d1.getTime()-(60*60*1000*24*2));   //gives past time
	System.out.println(d3);
	Date d4=new Date(d1.getTime()+(60*60*1000*24*3));   //gives future time
	System.out.println(d4);  

	}

}
