package com.fannie.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;

	public WaitTypes(WebDriver driver){
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout){

		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


			System.out.println("Visisble");

			return element;

		}catch(Exception e){
			System.out.println("time out");
		}

		return null;
	}


	public void clickWhenReady(By locator, int timeout){

		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);

			wait.until(ExpectedConditions.elementToBeClickable(locator));


			System.out.println("Visisble");



		}catch(Exception e){
			System.out.println("time out");
		}


	}
}