package com.spicejet.tests;
import org.openqa.selenium.WebDriver;
import com.spicejet.genericUtility.ExcelFileUtility;
import com.spicejet.genericUtility.JavaUtility;
import com.spicejet.genericUtility.PropertyFileKeys;
import com.spicejet.genericUtility.PropertyFileUtility;
import com.spicejet.genericUtility.SheetName;
import com.spicejet.genericUtility.WebDriverUtility;
import com.spicejet.objectRepository.HomePage;

public class BookflightTest {
///
	public static void main(String[] args) {
		PropertyFileUtility propertyFileUtility=new PropertyFileUtility();
		ExcelFileUtility excelFileUtility=new ExcelFileUtility();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		JavaUtility javaUtility=new JavaUtility();

		propertyFileUtility.openPropertyFile();
		String browser=propertyFileUtility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url=propertyFileUtility.getDataFromPropertyFile(PropertyFileKeys.URL.convertToString());
		long timeout=(Long)javaUtility.stringToAnyDataType(propertyFileUtility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString()),"long");

		excelFileUtility.openExcel();
		String fromInput=excelFileUtility.getDataFromExcel(SheetName.FLIGHTS.toString(),2,2);
		String toInput=excelFileUtility.getDataFromExcel(SheetName.FLIGHTS.toString(),2,3);
		System.out.println(fromInput);
		System.out.println(toInput);

		WebDriver driver=webDriverUtility.launchApplicationWithHandleNotification(browser, timeout, url);
		HomePage homePage=new HomePage(driver);
		homePage.clickOnroundtipRadioBtn();
		homePage.clickOnFromInputField(fromInput,webDriverUtility,timeout);
		homePage.clickOnToInputField(toInput,webDriverUtility,timeout);
		for (int i = 0; i <homePage.listOfMonthYear().size(); i++) 
		{  
			String currentMonthYear=homePage.listOfMonthYear().get(i).getText();
			System.out.println(currentMonthYear);
			String currentMonth=currentMonthYear.split(" ")[0];
			String currentYear=currentMonthYear.split(" ")[1];
			if(currentMonth.equals("August") && currentYear.equals("2023")){
	         break;
			}
			else {
				try {
					homePage.clickOnBackward().click();
				}
				catch(Exception e)
				{
					homePage.clickOnForward().click();
					i++;
				}
			}

		}



	}}



