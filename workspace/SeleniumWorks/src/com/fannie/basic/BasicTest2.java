package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest2 {
	
	//*[@id="q"]
	
	
	public static void main(String[] args){
		WebDriver driver;
		String baseURL = "http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");

		
		driver = new ChromeDriver();
		
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("best places to visit in VIrigina");
		
		driver.findElement(By.name("btnG")).click();

	/*	
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.quit();
		*/
}
}
