package AccessSpecifierForMethods_OutsideThePackageByBecomingSubClass;

import AccessSpecifierForMethods_WithinThePackage.Deepika; //need to import Deepika class for utilising its methods as it is in another package

public class Rithanyaa extends Deepika   //Rithanyaa becomes subclass of Deepika
{

	public static void main(String[] args) 
	{
		Rithanyaa R1=new Rithanyaa();
		R1.add();
		R1.mul();
	}

}
