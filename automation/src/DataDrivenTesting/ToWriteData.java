package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis =new FileInputStream("./TestData/ExcelData.xlsx");
		
		 Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		sheet.createRow(3).createCell(0).setCellValue("aman");
		
		FileOutputStream fos=new FileOutputStream("./TestData/ExcelData.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("Data has been updated");

	}

}
