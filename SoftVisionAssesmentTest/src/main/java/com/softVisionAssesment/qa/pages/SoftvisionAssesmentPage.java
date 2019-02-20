package com.softVisionAssesment.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.softVisionAssesment.qa.base.TestBase;

public class SoftvisionAssesmentPage {
	public class SoftvisionAssesmentPageTest extends TestBase{

		
		
		@FindBy(id="first_name")
		WebElement formsTitle;
		
		@FindBy(id="first_name")
		WebElement question;
		
		@FindBy(id="surname")
		WebElement ans1;
		
		@FindBy(id="surname")
		WebElement ans2;
		
		@FindBy(id="surname")
		WebElement ans3;
		
		@FindBy(id="surname")
		WebElement ans4;
		
		@FindBy(id="surname")
		WebElement ans5;
		
		@FindBy(id="surname")
		WebElement ans6;
		
		@FindBy(xpath = "//input[@type='submit' and @value='Save']")
		WebElement saveBtn;
		
		
		
		// Initializing the Page Objects:
		public SoftvisionAssesmentPageTest() throws Exception {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyContactsLabel(){
			return formsTitle.isDisplayed();
		}
		
		
		public void selectContactsByName(String name){
			driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
					+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		}
		
		
		public void createNewQuestion(String ques, String an1, String an2, String an3,String an4){
			
			
			question.sendKeys(ques);
			ans1.sendKeys(an1);
			ans2.sendKeys(an2);
			ans3.sendKeys(an3);
			ans4.sendKeys(an4);
			saveBtn.click();
			
		}
}}
