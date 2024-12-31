package testpkg;

 
import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Fblognpg;
import utilitiespkg.Excelutil;

public class Fbtest extends Basecls{
@Test
public void verifyLoginWithValidCred()
{
	Fblognpg p1=new Fblognpg(driver);
	//reading data from excel by specifing path
	String xl="C:\\Users\\leyat\\OneDrive\\Documents\\datadriventesting.xlsx";
	String sheet="Sheet1";
	int rowCount=Excelutil.getRowCount(xl,sheet);
	for(int i=1;i<rowCount;i++)
	{
		String Uname=Excelutil.getCellValue(xl,sheet,i,0);
		System.out.println("username: "+Uname);
		String pswd=Excelutil.getCellValue(xl,sheet,i,1);
		System.out.println("password: "+pswd);
		
		//passing username and password as parameters
		//submitting data by clicking login
		
		p1.setValues(Uname, pswd);
		p1.login();
	}
}
}
