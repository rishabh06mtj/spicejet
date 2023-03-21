package com.spicejet.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGclass {
protected WebDriver driver;


	@BeforeSuite
	public void setup()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void tearDown()
	{
		System.out.println("@AfterSuite");
	}
	@BeforeMethod
	public void runApplication()
	{
		
	System.out.println("open browser");
//		WebDriverManager.chromedriver().setup();
//	 driver=new ChromeDriver();
//	 sdriver=driver;
	//System.out.println(Thread.currentThread().getName());
	 
	}
	@AfterMethod
	public void afterApplication() throws InterruptedException
	{
		System.out.println("close browser");
//		Thread.sleep(3000);
//		driver.quit();
	}
	

}
