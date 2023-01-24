package pomclasswithpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UtiityClass {
    
	@Test
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\TestNg\\src\\pomclasswithpropertyfile\\propertyfile.properties");
		
		Properties prop=new Properties();
		prop.load(file);
		String value1=prop.getProperty(key);
		return value1;
	    
	}
	
	@Test
	public static String getDataFromExcellSheet(int ROW,int CELL) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\velocity\\automation\\parameterization.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet8");
		String value1=sh.getRow(ROW).getCell(CELL).getStringCellValue();
		return value1;
		
	}
}
