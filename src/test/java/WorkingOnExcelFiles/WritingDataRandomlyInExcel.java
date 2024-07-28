package WorkingOnExcelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataRandomlyInExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\WritingExcel_RandomData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("RandomData");
		XSSFRow row=sheet.createRow(2);
		XSSFCell cell=row.createCell(3);
		
		cell.setCellValue("Selenium");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File created with random data in specific cell");
	}

}
