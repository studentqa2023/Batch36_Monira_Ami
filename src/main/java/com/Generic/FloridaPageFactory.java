package com.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloridaPageFactory {
	
	public FloridaPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@class='cmp-globalnavigation__interaction-icon'])[5]")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getEmailfield() {
		return emailfield;
	}
	@FindBy(xpath="//*[@id='email']")
	private WebElement emailfield;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//*[@class='custom-button __b primary']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="(//*[contains(text(),'My Account')])[3]")
	private WebElement myAccount;

	public WebElement getMyAccount() {
		return myAccount;
	}
}
