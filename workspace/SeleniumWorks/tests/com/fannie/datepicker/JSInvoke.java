package com.fannie.datepicker;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.WaitTypes;


public class JSInvoke {


	private WebDriver driver;
	private String baseURL;
	private WaitTypes wt;
	private JavascriptExecutor jsExecutor;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		wt = new WaitTypes(driver);
		
		jsExecutor = (JavascriptExecutor) driver;
		
		this.baseURL =  "http://expedia.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	
	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}

	

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		//jsExecutor.exe

	}

}
