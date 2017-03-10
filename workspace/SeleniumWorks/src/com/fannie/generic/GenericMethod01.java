package com.fannie.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethod01 {
	
	WebDriver driver;
	
	public GenericMethod01(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(String locator, String type){
		
		WebElement element = null;
		
		type  = type.toLowerCase();
		
		if(type.equals("id")){
			System.out.println("found with locator: "+ locator);
		
			element =  this.driver.findElement(By.id(locator));
		}else if (type.equals("xpath")){
			System.out.println("found with locator: "+ locator);
			element= this.driver.findElement(By.xpath(locator));
		}else if (type.equals("css")){
			System.out.println("found with locator: "+ locator);
			element= this.driver.findElement(By.cssSelector(locator));
		}else if (type.equals("linktext")){
			System.out.println("found with locator: "+ locator);
			element= this.driver.findElement(By.linkText(locator));
		}
		
		if(this.checkSingle(locator, type)){
			System.out.println("Element found "+ locator);
			
		}else{
			System.out.println("Element not found "+ locator);
		}
		
		
		System.out.println("not found with locator: "+ locator);
		return element;
	}
	
	public List<WebElement> getElementList(String locator, String type){
		type = type.toLowerCase();
		
		if(type.equals("id")){
			System.out.println("found with locator: "+ locator);
			return this.driver.findElements(By.id(locator));
			
		}else if (type.equals("xpath")){
			System.out.println("found with locator: "+ locator);
			return this.driver.findElements(By.xpath(locator));
		}else if (type.equals("css")){
			System.out.println("found with locator: "+ locator);
			return this.driver.findElements(By.cssSelector(locator));
		}else if (type.equals("linktext")){
			System.out.println("found with locator: "+ locator);
			return this.driver.findElements(By.linkText(locator));
		}
		
		
		System.out.println("not found with locator: "+ locator);
		return null;
	}
	
	public boolean isElementFound(String locator, String type){
		return this.getElementList(locator, type).size()>0;
	}
	
	public boolean checkSingle(String locator, String type){
		return this.getElementList(locator, type).size()==1;
	}

}
