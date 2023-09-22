package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row=null;
	public static XSSFCell cell=null;
	public static FileInputStream file;
	public static String cellData;
	public static String FirstName;
	public static String LastName;
	public static String PinCode;
	
	public static List<String> getExcelData()
	{
		List<String> PayData=new ArrayList<String>();
		
		try {
			file=new FileInputStream("src/test/resources/ExcelDataFiles/SwagLab.xlsx");
		    wb=new XSSFWorkbook(file);
		    sheet=wb.getSheet("Sheet1");
		    int rows=sheet.getLastRowNum()+1;
		    int coloumn=sheet.getRow(0).getLastCellNum();
		    
		    for(int i=1;i<rows;i++)
		    {
		    	for(int j=0;j<coloumn;j++)
		    	{
		    		 cellData=sheet.getRow(i).getCell(j).getStringCellValue();
		    		 PayData.add(cellData);
		    	}
		    }
		  }
		  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PayData;
	}
	
	public static String get_First_Name() {
		List<String>data= getExcelData();
		FirstName=data.get(0);
		return FirstName;
	}
	
	public static String get_last_Name() {
		List<String>data= getExcelData();
		LastName=data.get(1);
		return LastName;
	}
	
	public static String get_Pin_Name() {
		List<String>data= getExcelData();
		PinCode=data.get(2);
		return PinCode;
	}
}
