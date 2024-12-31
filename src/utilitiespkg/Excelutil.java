package utilitiespkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static String getCellValue(String xl,String Sheet,int r,int c)
	{
	try
	{
		
		File f=new File(xl);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFCell cell=(XSSFCell)wb.getSheet(Sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else
		{
			//double v=cell.getNumericCellValue();   this method typecasting has to be done from double to string which is not directly possible instead we can convert to int then to string
			//int val=(int)v;                        else can use getRawValue which only support string value
			//return String .valueOf(val);
			return cell.getRawValue();
			
		}
	}
	catch(Exception e)
	{
		return "";
	}
}
public static int getRowCount(String xl,String Sheet)
{
	try
	{
		File f=new File(xl);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		return wb.getSheet(Sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		return 0;
	}
}
}
