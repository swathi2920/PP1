package Apr_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDEmo {

	public static void main(String[] args) 
	{

		
		try {
			File f= new File("src\\Apr_17\\new.xlsx");
			FileInputStream fis;
			fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
			//System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
			System.out.println(sh.getLastRowNum());
			System.out.println(sh.getRow(0).getLastCellNum());
			
			for(int r=0; r<= sh.getLastRowNum(); r++)
			{
				for(int c=0 ; c<sh.getRow(0).getLastCellNum(); c++)
				{
					System.out.print(sh.getRow(r).getCell(c).getStringCellValue()+ "   ");
				}
				
				System.out.println();
			}
			
		} catch (IOException e) 
		{
						e.printStackTrace();
		}
		

	}

}
