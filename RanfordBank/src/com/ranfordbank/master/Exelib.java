package com.ranfordbank.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {

	public static void main(String[] args) throws IOException
	{
	   //Instance Class
		
		Library Lb=new Library();
		
		String Res=Lb.OpenApp("http://183.82.100.55/ranford2");
         System.out.println(Res);
         
		 Lb.AdminLgn("Admin","Admin");
		 
		 //to get test data excel file 
	
		 FileInputStream Fis=new FileInputStream("E:\\dinesh_project\\RanfordBank\\src\\com\\ranfordbank\\testdata\\Role.xlsx");
		 
		 //Workbook
		 
		 XSSFWorkbook Wbook=new XSSFWorkbook(Fis);
		 
		 //sheet
		 
		 XSSFSheet Wsheet=Wbook.getSheet("Roledata");
		 
		 //Row count
		 
		 int Rcount=Wsheet.getLastRowNum();
		 
		 //multiple interations---------------For loop
		 
		 for (int i=1;i<=Rcount;i++) 
		 {
			//row
			 
			 XSSFRow WRow=Wsheet.getRow(i);
			 
			 //cell 
			 
			 XSSFCell Wcell=WRow.getCell(0);
			 XSSFCell Wcell1=WRow.getCell(1);
			 XSSFCell Wcell2=WRow.getCell(2);

			 XSSFCell Wcell3=WRow.createCell(3);
			 
			 //Cell values
			 
			 String Rname=Wcell.getStringCellValue();
			 String Rdes=Wcell1.getStringCellValue();
			 String Rtyp=Wcell2.getStringCellValue();
			 
			Res=Lb.RoleCre(Rname,Rdes,Rtyp);
			
			Wcell3.setCellValue(Res);
			 }
		 
		 FileOutputStream Fos=new FileOutputStream("E:\\dinesh_project\\RanfordBank\\src\\com\\ranfordbank\\results\\Resrole.xlsx");
		 Wbook.write(Fos);
		 Wbook.close();
		 
	}

}
