package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest3 {public static void main(String[] args){
	WebDriver driver;
	String baseURL = "http://naveenks.com/selenium/RegForm.html";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");

	
	driver = new ChromeDriver();
	
	
	driver.get(baseURL);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("inputEmail")).sendKeys("joe@google.com");
	
	driver.findElement(By.id("firstName")).sendKeys("joe");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("firstName")).clear();
	
	
	//driver.findElement(By.name("btnG")).click();

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
