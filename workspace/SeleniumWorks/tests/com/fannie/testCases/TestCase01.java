package com.fannie.testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {


	ChromeDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
			
			Thread.sleep(2000);
			driver.quit();
		}
	
	
			

	@Test
	public void clickNavigate() throws InterruptedException{
		driver.get(baseURL);
			
			String currentURL = driver.getCurrentUrl();
			
			driver.navigate().to("http://naveenks.com/selenium/RegForm.html");
			
			currentURL = driver.getCurrentUrl();
			
			Thread.sleep(2500);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.navigate().refresh();
			
			driver.navigate().forward();
			
			System.out.println(driver.getPageSource());
			
			
			
		}
		
		
		
		
		

	}

