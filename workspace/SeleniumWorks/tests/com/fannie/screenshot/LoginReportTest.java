package com.fannie.screenshot;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.pom.DriverFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginReportTest {
	
	private static WebDriver driver;
	
	private String baseUrl;
	
	private static ExtentReports report;
	
	private ExtentTest test;
	
	@BeforeClass
	public static void beforeClass(){
		driver = DriverFactory.getDriverFacotry("chrome");
		String filePath = "C:\\Users\\Huser\\Desktop\\reports\\LoginReportTest.html";
		report = new ExtentReports(filePath);
		
	}
	
	@Before
	public void setUp(){
		baseUrl = "http://cinetalenters.com/#/login";
		
			
			test = report.startTest(" loging gor usoger l");
			
			test.log(LogStatus.INFO, "Before loading base url" );
			
			driver.get(baseUrl);
	}
	

	@After
	public void tearDown() throws Exception {
		report.endTest(test);
		report.flush();
	}

	@Test
	public void test() {
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("jflskjflkjd");
		
		WebElement password = driver.findElement(By.id("password"));
				
				password.sendKeys("lskfjasldfj");
		
		test.log(LogStatus.INFO, "password sent ");
		
		WebElement sub = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[3]/div/button"));
		sub.click();
		
		test.log(LogStatus.INFO, "submit button clicked ");
	}

}
