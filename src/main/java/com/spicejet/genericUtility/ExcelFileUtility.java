package com.spicejet.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	private  Workbook workbook;
	private	FileInputStream fisExcel;
	private FileOutputStream fos;
	
	public void openExcel()
	{
		try {
			fisExcel = new FileInputStream(IConstntPath.EXCEL_PATH);
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			workbook=WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	/**
	 * this method is used to fetch the data from excel using row and cell index 
	 * @param excelPath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 */
	public String getDataFromExcel(String sheetName,int rowNumber,int cellNumber)
	{
		DataFormatter df=new DataFormatter();
		String data=df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber));
		return data;
	}
/**
 * this method is used to close the excel
 */
public void closeExcel()
{
try {
	fisExcel.close();
} catch (IOException e) {
	
	e.printStackTrace();
}
try {
	workbook.close();
} catch (IOException e) {
	
	e.printStackTrace();
}
	}

 
public void setExcelData(String sheetName,int rowNumber,int cellNumber,String value)
{
	workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).setCellValue(value);
	
	try {
		fos = new FileOutputStream(IConstntPath.EXCEL_PATH);
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	}
	try {
		workbook.write(fos);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}



}
