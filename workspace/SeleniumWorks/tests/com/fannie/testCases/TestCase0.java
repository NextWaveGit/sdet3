package com.fannie.testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase0 {

	ChromeDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "http://google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/	
	@Test
	public void testGoogleSite() throws Exception{
		driver.get(baseURL);
		/*
		WebElement e1 = driver.findElement(By.id("lst-ib"));
		e1.sendKeys("Weather in Virginia");
		
		System.out.println(e1);
	
		*/
	WebElement e2 = driver.findElement(By.id("gs_taif0"));
		
		System.out.println(e2 + "  " +e2.isEnabled());
	
	WebElement e3 = driver.findElement(By.id("gs_htif0"));
		
		System.out.println(e3);
			
	}
	

}
