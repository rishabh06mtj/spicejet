package com.spicejet.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class VtigerLoginPage {
@FindBy(name="user_name")
private WebElement usernameTxtField;
@FindBy(name="user_password")
private WebElement passwordTxtField;
@FindBy(id="submitButton")
private WebElement loginButton;
@FindBy(name="user_name")
private WebElement usernafmeTxtField;

}
