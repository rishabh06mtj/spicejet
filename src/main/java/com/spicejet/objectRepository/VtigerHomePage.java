package com.spicejet.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VtigerHomePage {
	@FindBy(xpath="//img[@title='Show World Clock...']/parent::td/preceding-sibling::td/img[@title='Open Calendar...']")
	private WebElement calendarIcon;
	@FindBy(xpath="//td[@class='calHdr']//b")
	private WebElement monthYear;
	@FindBy(xpath="//img[@src='themes/images/small_right.gif']")
	private WebElement forwardClick;
	@FindBy(xpath="/a[text()='%s']")
	private WebElement clickOnDate;
	public VtigerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * this method is used to click on calender icon
	 */
	public void clickOnCalenderIcon()
	{
		calendarIcon.click();
	}
	/**
	 * this method is used to return the month and year text
	 * @return
	 */
	public String getMonthYear()
	{
		return monthYear.getText();
	}
	/**
	 * this method is used to click on forward button on calender popup
	 */

	public void clickOnForwardButton()
	{
		forwardClick.click();
	}
	/**
	 * this mthod is used to click on particular date
	 */
	public void clickOnParticularDate()
	{
		clickOnDate.click();
	}

}
