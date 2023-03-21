
package com.spicejet.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	private WebDriver driver;
	private WebDriverWait wait;
	

	/**
	 * this method is used to 
	 * launch the browser based on browser key
	 * maximize the browser
	 * provide implicitly wait
	 * launch application by using url
	 * @param browser
	 * @param timeout
	 * @param url
	 * @return
	 */
	public WebDriver launchApplication(String browser,long timeout,String url)
	{    
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")) 
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	public WebDriver launchApplicationWithHandleNotification(String browser,long timeout,String url)
	{    
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")) 
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	public void elementNotIntercepted(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public void visibilityOfElement(long timeout,WebElement element) {
		wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));}
	public void element_To_Be_Clickable(long timeout,WebElement element)
	{
		wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method is used to perform mouse actions
	 * @param element
	 * @param strategy
	 */
	public void action_mouseHover(WebElement element,String strategy)
	{
		Actions a =new Actions(driver);
		if(strategy.contains("mousehover")){
			a.moveToElement(element).perform();
		}
		else if(strategy.contains("rightclick"))
		{
			a.contextClick(element).perform();
		}

		else if(strategy.contains("doubleclick"))
		{ 
			a.doubleClick(element).perform();
		}

	}
	public void handleCalenderPopUp()
	{}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
