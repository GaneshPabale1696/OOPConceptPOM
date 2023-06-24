package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	//page locators:
	private By emailId = By.id("username");
	private By password= By.id("password");
	private By btnlogin=By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	
	//getters:
	public LoginPage(WebDriver driver) {
		super(driver);
	}


	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getBtnlogin() {
		return getElement(btnlogin);
	}


	public WebElement getHeader() {
		return getElement(header);
	}	
	
	
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username,String password)
	{
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getBtnlogin().click();
		
		return getInstance(HomePage.class);
	}
	
	public void	 doLogin()
	{
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getBtnlogin().click();
		
	}
	
	public void doLogin(String userCred)
	{
		if(userCred.contains("username")) {
		getEmailId().sendKeys(userCred.split(":")[1].trim());
		} else if(userCred.contains("password")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		
		getBtnlogin().click();
		
	}
	
	
}
