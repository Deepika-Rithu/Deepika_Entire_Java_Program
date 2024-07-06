package TypeCasting;

public class Int_To_Double 
{

	public static void main(String[] args) 
	{
		int age=34;
		double agenew=age;     //implicit widening
		System.out.println(age);
		System.out.println(agenew);
		
		int age1=56;
		double agenew1=(double)age1;     //explicit widening
		System.out.println(age1);
		System.out.println(agenew1);

	}

}
