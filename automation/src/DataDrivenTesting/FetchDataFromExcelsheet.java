package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("./TestData/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String customerName2 = cell.getStringCellValue();
		System.out.println("The customer 2 name is:"+customerName2);
		int customer2phoneNo=(int)row.getCell(1).getNumericCellValue();
		
		System.out.println("customer 2 phone no:"+customer2phoneNo);
		
		int customer1phoneNo = (int)sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("customer 1 phone no:"+customer1phoneNo);
		
		boolean customer1Status = sheet.getRow(1).getCell(2).getBooleanCellValue();
		if(customer1Status) {
			System.out.println("customer is active");
		}
		else
			System.out.println("customer is inactive");
		

	}

}
