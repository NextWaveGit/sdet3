package com.fannie.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;
	
	public static WebDriver getDriverFacotry(String browser){
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			return driver;
			
			
		}
		
		return null;
	}
	
	
	
	
	

}
