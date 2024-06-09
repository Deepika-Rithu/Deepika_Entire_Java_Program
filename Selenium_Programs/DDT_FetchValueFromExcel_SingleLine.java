package Selenium_Basic_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_FetchValueFromExcel_SingleLine
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Basic\\TestData\\Deepika.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String value=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);

	}

}
