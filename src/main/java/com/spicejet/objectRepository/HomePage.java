package com.spicejet.objectRepository;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spicejet.genericUtility.WebDriverUtility;
public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//div[text()='round trip']")	
	private WebElement roundtipRadioBtn;
	@FindBy(xpath="//div[@data-testid='to-testID-origin']/div/div/input")
	private WebElement fromInputField;
	@FindBy(xpath="//div[text()='Select a region and city below']")
	private WebElement waitForCityToSelect;
	@FindBy(xpath="//div[@data-testid='to-testID-destination']/descendant::input")
	private WebElement toInputField;
	@FindBy(xpath="//div[text()='Departure Date']")
	private WebElement departureDateInputField;
	
	
	@FindBy(xpath="//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")
	private WebElement clickForward;
	@FindBy(xpath="//div[@class='r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")
	private WebElement clickBackward;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")
	private List<WebElement> listOfMonthYear;
	@FindBy(xpath="//div[text()='Return Date']")
	private WebElement returnDateInputField;
	
	public List<WebElement> listOfMonthYear()
	{
		return listOfMonthYear;
	}
	public 	WebElement clickOnBackward()
	{
		return clickBackward;
	}
	public 	WebElement clickOnForward()
	{
		return clickForward;
	}
		
		

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement stringToWebElement(String partialXpath,String replaceData)
	{
		String xpath=String.format(partialXpath,replaceData);
		return driver.findElement(By.xpath(xpath));
	}
	public void clickOnroundtipRadioBtn()
	{
		roundtipRadioBtn.click();
	}
	public void clickOnFromInputField(String input,WebDriverUtility webDriverUtility,long timeout)
	{
		fromInputField.clear();
		waitForCityToSelect(webDriverUtility,timeout);
		fromInputField.sendKeys(input);
	}
	public void clickOnToInputField(String input,WebDriverUtility webDriverUtility,long timeout)
	{	toInputField.clear();
		waitForCityToSelect(webDriverUtility,timeout);
		toInputField.sendKeys(input);
		
	}
	public void waitForCityToSelect(WebDriverUtility webDriverUtility,long timeout)
	{
		webDriverUtility.visibilityOfElement(timeout, waitForCityToSelect);
	}
	public void clickOnDepartureDateInputField(WebDriverUtility webDriverUtility,long timeout)
	{
		//webDriverUtility.action_mouseHover(departureDateInputField, "doubleclick");
		//webDriverUtility.action_mouseHover(departureDate,"doubleclick");
	
		departureDateInputField.click();
	}
	
	
//	@FindBy(xpath="//div[@data-testid='home-page-travellers']")
//	private WebElement passengerinputField;
//	@FindBy(xpath="//div[text()='Children']/../following-sibling::div/descendant::div[@data-testid='Children-testID-plus-one-cta']")
//	private WebElement passengerAdd;
//	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
//	private WebElement searchFlightButton;
//
//	public void clickOnPassengerInputField()
//	{
//		passengerinputField.click();	
//	}
//	public void addPassenger()
//	{
//		passengerAdd.click();
//	}
//	public void clickOnSearchFlight()
//	{
//		searchFlightButton.click();
//	}
}







////div[@data-testid='undefined-calendar-picker']/div/*[name()='svg']




////div[@data-testid='home-page-travellers']/following-sibling::div/descendant::div[@data-testid='Adult-testID-plus-one-cta']/*[name()='svg']
//div[text()='round trip']
//div[@data-testid='round-trip-radio-button']/div/*[name()='svg']/*
//private WebElement fromTxtField;
////div[@data-testid='undefined-calendar-picker']/descendant::div[@data-testid='undefined-month-December-2022']
//div[text()='December ']/../following-sibling::div/descendant::div[text()='1']