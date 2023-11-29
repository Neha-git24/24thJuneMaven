package LiabraryFiles;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	//@AutherName:Neha
	//This method is used to get data from excel sheet
	//need to pass 2 inputs 1:rowindex 2:colindex
public static String getTD(int rowIndex,int colIndex) throws IOException
{
	//FileInputStream file=new FileInputStream("C:\\Selenium\\Excel_Sheets\\Return_types.xlsx");
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Excel_Sheets\\Return_types.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	return value;
}
public static String getDataFrom(String Key) throws IOException
{
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\POM_DDF_TestNG.properties");
	
	Properties p=new Properties();
	p.load(file);
	
	String value=p.getProperty(Key);
	return value;
}
}
