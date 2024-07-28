package WorkingOnExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook --> Sheets --> Rows --> cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\ExcelSheet1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");	//OR   XSSFSheet sheet=workbook.getSheetAt(0);
		
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows: "+totalRows);
		System.out.println("Number off cells: "+totalCells);
		
		for(int r=0; r<=totalRows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0; c<=totalCells; c++) {
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}
	
}
