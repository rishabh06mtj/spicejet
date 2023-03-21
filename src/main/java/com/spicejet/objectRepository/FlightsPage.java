package com.spicejet.objectRepository;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//coomit remote master branch


public class FlightsPage {
@FindBy(xpath="//div[text()='Select your' and text()='Departure to']/parent::div/parent::div/parent::div/following-sibling::div/descendant::div[text()='SG 535']/parent::div/parent::div/parent::div/following-sibling::div//span/parent::div")
private List<WebElement> flightDeparturePrice;
@FindBy(xpath="//div[text()='Select your' and text()='Return Flight to']/parent::div/parent::div/parent::div/following-sibling::div/descendant::div[text()='SG 143']/parent::div/parent::div/parent::div/following-sibling::div//span/parent::div")
private List<WebElement> flightReturnPrice;
@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
private WebElement clickOnContinue;




public void clickOnContinue()
{
	clickOnContinue.click();
	 
}

}

