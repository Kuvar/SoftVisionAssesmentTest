package com.softVisionAssesment.qa.testCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.softVisionAssesment.qa.Utilities.TestUtility;
import com.softVisionAssesment.qa.base.TestBase;
import com.softVisionAssesment.qa.pages.LoginPasswordPage;
import com.softVisionAssesment.qa.pages.LoginUsernamePage;
import com.softVisionAssesment.qa.pages.SoftvisionAssesmentPage;

public class LoginUsernamePageTest extends TestBase {

	LoginUsernamePage loginUsernamePage;
	LoginPasswordPage loginPasswordPage;
	SoftvisionAssesmentPage loginSoftvisionAssesmentPage;
	TestUtility testUtil;
	
	
	public LoginUsernamePageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	public void setUp() throws Exception{
		
		initialization();
		
		PageFactory.initElements(driver, this);
	  
		loginUsernamePage = new LoginUsernamePage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginUsernamePage.validateLoginPageTitle();
		Assert.assertEquals(title, "Google Forms: Sign-in");
	}
	/*
	 * 
	@Test(priority=2)
	public String validateSignIn(){
		String text = loginUsernamePage.validatesignInLogo().gettext();
		Assert.assertEquals());
	}
	*/
	
	@Test(priority=3)
	public void login () throws Exception{
		try {
			loginPasswordPage = loginUsernamePage.loginUser(prop.getProperty("username"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}


