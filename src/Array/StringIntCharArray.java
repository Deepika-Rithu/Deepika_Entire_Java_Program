package Array;

public class StringIntCharArray
{
	public static void main(String[] args)
	{
		String Names[]=new String[3];  //String datatype array
		Names[0]="Deepika";
		Names[1]="Vignesh";
		Names[2]="Rihanya";
		
		int []RollNo=new int[3];       //int datatype array
		RollNo[0]=12;
		RollNo[1]=13;
		RollNo[2]=14;
		
		char[]Gender=new char[3];      //char datatype array
		Gender[0]='F';
		Gender[1]='M';
		Gender[2]='F';
		
		System.out.println("Student Name"+"    "+"Roll No"+"    "+"Gender");
		for(int i=0;i<RollNo.length;i++)
		{
			System.out.println(Names[i]+"            "+RollNo[i]+"         "+Gender[i]);
		}

	}

}
