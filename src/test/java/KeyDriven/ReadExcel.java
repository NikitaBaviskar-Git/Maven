package KeyDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	static List<String> keywordlist =new ArrayList<String>();
	
	public static void readtheexcel() throws IOException {
	//excel
	FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData1.xlsx");
	//workbook--workbook is present in the file object
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//to get the sheet from the work book
	XSSFSheet sheet=workbook.getSheet("Sheet2");//providing sheet name
	//XSSFSheet sheet=workbook.getSheetAt(0);//providing index for the sheets present
	
	//no.of rows
	int rowcnt=sheet.getLastRowNum();
	System.out.println(rowcnt);
	
	//to focus on row inorder to get the column numbers
	int colcnt=sheet.getRow(0).getLastCellNum();
	System.out.println(colcnt);
	
	//to read the values from excel sheet
	for (int i=0;i<=rowcnt;i++){
		
		String keywords=sheet.getRow(i).getCell(0).toString();
		keywordlist.add(keywords);
		}	
	System.out.println(keywordlist);
	if(keywordlist.get(0).equalsIgnoreCase("openurl")) {
		Keywords.openurl();
	}
	if(keywordlist.get(1).equalsIgnoreCase("username")) {
		Keywords.username();
	}
	if(keywordlist.get(2).equalsIgnoreCase("password")) {
		Keywords.password();
	}
	if(keywordlist.get(3).equalsIgnoreCase("login")) {
		Keywords.login();
	}
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readtheexcel();
		
	}

}
