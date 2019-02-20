package complex;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import utitlites.Excel;
import utitlites.Generics;

public class ExcelReader {

	public static void main(String[] args)  throws Exception {
		String path ="C:\\Users\\udaykumar.h\\Pictures\\Saved Pictures";
		System.out.println(Generics.readFiles(path));
		HashMap<String, Integer> x = Generics.getFileExtensions(Generics.readFiles(path).trim());
		System.out.println(x);
		/*Workbook wb = WorkbookFactory.create(new FileInputStream(".//sample2.xlsx"));
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		int colCount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();

		for(int i=0;i<=rowCount;i++) {
		 for(int j=0;j<colCount;j++) {

			 System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(j).toString());
		 }
		}

	 Excel.getFirstRowValues(wb, rowCount, colCount, "e");*/
	}
}









//	 Workbook wb = WorkbookFactory.create(new FileInputStream(".\\sample.xlsx"));

/*int  rc = wb.getSheet("Sheet1").getLastRowNum();

	 int cc = wb.getSheet("Sheet1").getPhysicalNumberOfRows();

	 int cc1 = wb.getSheet("Sheet1").getRow(0).getLastCellNum();

	String s = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();



	System.out.println(rc);
	System.out.println(s);
	System.out.println(cc);
	System.out.println(cc1);
 */




