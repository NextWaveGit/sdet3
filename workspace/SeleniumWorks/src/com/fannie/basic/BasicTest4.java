package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest4 {
	
		
		public static void main(String[] args){
			WebDriver driver;
			String baseURL = "https://demostore.x-cart.com/";
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");

			
			driver = new ChromeDriver();
			
			
			driver.get(baseURL);
			
			driver.manage().window().maximize();
		
			/*
			driver.findElement(By.linkText("Shipping")).click();
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.partialLinkText("Contact")).click();

*/
			
			driver.findElement(By.tagName("a")).click();
			
	}		

}
