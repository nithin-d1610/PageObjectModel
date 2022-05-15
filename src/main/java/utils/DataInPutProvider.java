package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataInPutProvider {
	
	public static String[][] getData(String sheetName) {
		
		String[][] testData = null;
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TestDataSheet.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			int rowCount = sheet.getLastRowNum();
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			System.out.println("Row Count "+rowCount);
			
			System.out.println("Column Counut "+columnCount);
			
			
			testData = new String[rowCount][columnCount];
			
			for(int i=1; i<=rowCount;i++) {
				
				XSSFRow row = sheet.getRow(i);
				
				for(int j=0; j<columnCount;j++) {
					
					String cellData = row.getCell(j).getStringCellValue();
					
					System.out.println("The value of row "+(i-1)+" and columns "+j+" is: "+cellData);
					
					testData[i-1][j] = cellData;
					
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return testData;
	
	
	}


}
