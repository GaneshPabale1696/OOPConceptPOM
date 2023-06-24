package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyLoginPageTitleTest()
	{
		String title=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority = 2,enabled=false)
	public void verifyLoginPageHeader()
	{
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test(priority =3)
	public void doLogintest() {
		HomePage homePage=page.getInstance(LoginPage.class).doLogin("ganeshpabale7@gmail.com","Ganesh@1696");
		String headerHome=homePage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Quickly connect with leads one to one");
		
	}

}
