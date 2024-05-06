package Array;

public class IntArray 
{
	public static void main(String[] args)
	{
	String Names[]=new String[3];
	Names[0]="Deepika";
	Names[1]="Vignesh";
	Names[2]="Rithu";
	
	int RollNo[]=new int[3];
	RollNo[0]=12;
	RollNo[1]=13;
	RollNo[2]=14;
	System.out.println("Student Name"+"    "+"Roll No");
	for(int i=0;i<RollNo.length;i++)
	{
		System.out.println(Names[i]+"            "+RollNo[i]);
	}
	
	}

}
