package com.softVisionAssesment.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws Exception
	{
	try
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/admin/eclipse-workspace/SoftVisionAssesmentTest/SoftVisionAssesmentTest/src/main/java/com/softVisionAssesment/qa/config/config.properties");
		System.getProperties();
		prop.load(fis);
	}
	catch(FileNotFoundException e )
	{
		e.printStackTrace();
	}
}

public void initialization()
{
	
	String browserName=prop.getProperty("Browser");

	if(browserName.contentEquals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C://Users/admin/eclipse-workspace/SoftVisionAssesmentTest/SoftVisionAssesmentTest/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browserName.contentEquals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/admin/eclipse-workspace/SoftVisionAssesmentTest/SoftVisionAssesmentTest/Driverschromedriver.exe");
		driver=new ChromeDriver();
	}
	
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C://Users/admin/eclipse-workspace/SoftVisionAssesmentTest/SoftVisionAssesmentTest/Drivers/geckodriver.exe"
		 * ); driver=new FirefoxDriver(); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); driver.manage().window().maximize();
		 * driver.manage().deleteAllCookies();
		 * driver.get("https://docs.google.com/forms");
		 * //driver.get(prop.getProperty("URL")); String
		 * signInLogo=driver.findElement(By.
		 * xpath("//content[contains(text(),'Sign in')]")).getText();
		 * System.out.println(signInLogo);
		 * driver.findElement(By.id("identifierId")).sendKeys("prajaktac1291");
		 * driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 * //driver.findElement(By.xpath(
		 * "//input[@type='password')).sendKeys("NewFaith99");
		 * driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 */
	
	
	
	
	
	
	}
}
