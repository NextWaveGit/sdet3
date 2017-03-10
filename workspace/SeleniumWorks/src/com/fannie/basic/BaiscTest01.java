package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaiscTest01 {
	public static void main(String[] args){
		WebDriver driver;
		String baseURL = "http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");

		//baseURL = "http://www.bing.com/?pc=EUPP_COSP&ptag=D013017-A855B9C56E1&form=CONMHP&conlogo=CT3335450";
		
		baseURL = null;
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Huser\\Desktop\\selenium\\IEDriverServer.exe");
		
		driver = new ChromeDriver();
		
		driver = new InternetExplorerDriver();
		
		
		driver.get(baseURL);
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
