/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Sai
 *
 */
public class HomePage extends BasePage{

	private By header = By.cssSelector("div[data-task-group='use-case-connect-leads'] h3[class='Heading-sc-1xmrcvy-0 H3-lzbo0y-0 HaPRW m-bottom-2']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getHeader() {
		return getElement(header);
	}
	
	//page actions
	public String getHomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
	  return getPageHeader(header);
	}	
	
	
}
