package AccessSpecifierForMethods_OutsideThePackageWithoutBecomingSubClass;

import AccessSpecifierForMethods_WithinThePackage.Deepika;

public class Hema      //no relation with Deepika so Hema is not subclass of Deepika
{

	public static void main(String[] args) 
	{
		Deepika d1=new Deepika();   //Create object of Deepika class
		d1.add();                   //able to access only public method

	}

}

