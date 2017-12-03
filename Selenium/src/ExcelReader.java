import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.File;


public class ExcelReader {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		String FilePath = "C://Users//a//Desktop//Selenium2.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(0);
		//System.out.println(sh.getCell(0,0).getContents());
		Cell Row0Col0 = sh.getCell(0,0);
		Cell Row0Col1 = sh.getCell(0,1);
		Cell Row1Col0 = sh.getCell(1,0);
		Cell Row1Col1 = sh.getCell(1,1);
		String FirstRowFirstColumn = Row0Col0.getContents();
		String FirstRowSecondColumn = Row0Col1.getContents();
		String SecondRowFirstColumn = Row1Col0.getContents();
		String SecondRowSecondColumn = Row1Col1.getContents();
		System.out.print(FirstRowFirstColumn);
		System.out.print(FirstRowSecondColumn);
		System.out.println(SecondRowFirstColumn);
		System.out.print(SecondRowSecondColumn);
	}

}
