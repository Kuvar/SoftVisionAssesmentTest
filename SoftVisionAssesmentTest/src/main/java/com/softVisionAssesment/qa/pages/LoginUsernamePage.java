package com.softVisionAssesment.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.softVisionAssesment.qa.base.TestBase;



public class LoginUsernamePage extends TestBase {
	
	 
    

	@FindBy(xpath="//content[contains(text(),'Sign in')]")
	WebElement signInLogo;
	
	@FindBy(id="identifierId")
	WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement clickOnNext;
	
	
	
	
	//Initializing the Page Objects:
	
	public LoginUsernamePage() throws Exception
	{
	
	PageFactory.initElements(driver, this);

    
    }
	
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validatesignInLogo(){
		return signInLogo.isDisplayed();
	}
	
	public LoginPasswordPage loginUser(String un) throws Exception{
		username.sendKeys(un);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", clickOnNext);
		    	
		    	return new LoginPasswordPage();
		    	
	}

}
	
