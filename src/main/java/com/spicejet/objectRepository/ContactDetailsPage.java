package com.spicejet.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetailsPage {
@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")	
private WebElement firstNametxtbox;
@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")	
private WebElement lastNametxtbox;

	
}
