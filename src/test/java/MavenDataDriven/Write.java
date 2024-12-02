package MavenDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws IOException {

	//excel
	FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData1.xlsx");
	//workbook--workbook is presnt in the file object
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//to get the sheet from the work book
	XSSFSheet sheet=workbook.getSheet("Sheet3");//providing sheet name
	//XSSFSheet sheet=workbook.getSheetAt(0);//providing index for the sheets present
	
	
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell=row.createCell(2);
	cell.setCellValue("Hello");
	
	FileOutputStream out = new	FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData1.xlsx");
	workbook.write(out);
	workbook.close();
	
	}
}
