package com.softVisionAssesment.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.softVisionAssesment.qa.base.TestBase;


public class LoginPasswordPage extends TestBase {
	FormHomePage formHomePage;
	
	
	public LoginPasswordPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement loginBtn;
	
	
	
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public FormHomePage loginUser(String pwd) throws Exception{
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		    	return new FormHomePage();
		    	
		    	
	}


}
