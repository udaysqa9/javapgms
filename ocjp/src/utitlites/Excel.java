package utitlites;

import org.apache.poi.ss.usermodel.Workbook;

public class Excel {

	/**
	 * @author udaykumar.h
	 * 
	 * Method returns column specific values
	 */
	public static void getFirstRowValues(Workbook wb,int rc, int cc, String columnName) {
		int foundColumn=0;
		for(int i=0;i<1;i++) {
			for(int j=0;j<cc;j++) {
				if (columnName.equals(wb.getSheet("Sheet1").getRow(i).getCell(j).toString())) {
					foundColumn=j;
					break;
				}
				else {
					foundColumn=-1;

				}

			}
		}

		if(foundColumn>=0) {

			for(int i=1;i<=rc;i++) {
				System.out.println((wb.getSheet("Sheet1").getRow(i).getCell(foundColumn).toString()));
			}
		}
		else
			System.out.println("Not found!");

	}

}


