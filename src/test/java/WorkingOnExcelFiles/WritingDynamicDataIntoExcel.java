package WorkingOnExcelFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\WritingExcel_dynamically.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Rows?");
		int noOfRows=input.nextInt();
		System.out.println("Enter number of Cells?");
		int noOfCells=input.nextInt();
		
		for(int r=0; r<=noOfRows; r++) {
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0; c<noOfCells; c++) {
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(input.next());
			}
		}
		
		workbook.write(file); //attaching workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created with Dynamic data !!");
		
	}

}
