package com.softVisionAssesment.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.softVisionAssesment.qa.base.TestBase;
import com.softVisionAssesment.qa.pages.FormHomePage;
import com.softVisionAssesment.qa.pages.LoginPasswordPage;
import com.softVisionAssesment.qa.pages.LoginUsernamePage;

public class LoginPasswordPageTest extends TestBase {
	

	LoginPasswordPage loginPasswordPage;
	FormHomePage formHomePage;


public LoginPasswordPageTest() throws Exception {
	super();
	// TODO Auto-generated constructor stub
}




@BeforeMethod
public void setUp() throws Exception{
	initialization();
	PageFactory.initElements(driver, this);

	try {
		loginPasswordPage = new LoginPasswordPage();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}

@Test(priority=1)
public void loginPageTitleTest(){
	String title = loginPasswordPage.validateLoginPageTitle();
	AssertJUnit.assertEquals(title, "Google Forms: Sign-in");
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
public void loginTest() throws Exception{
	try {
		formHomePage = loginPasswordPage.loginUser(prop.getProperty("password"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}




@AfterMethod
public void tearDown(){
	driver.close();
}





}



