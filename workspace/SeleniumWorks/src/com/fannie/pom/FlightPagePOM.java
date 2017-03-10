package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPagePOM {
	
	
	public static WebElement element;
	
	
	
    public static WebElement fliyingFromTextBox(WebDriver driver){
    	
    	element = driver.findElement(By.id("flight-origin-hp-flight"));
    	
    	return element; 	
    	
		}
    
    public static void fliyingFromTextBox(WebDriver driver, String dest){
    	
    	driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(dest);
    	
    	
		}
    
public static WebElement fliyingToTextBox(WebDriver driver){
    	
    	element = driver.findElement(By.id("flight-destination-hp-flight"));
    	
    	return element; 	
    	
		}

public static void fliyingToTextBox(WebDriver driver, String src){
	
driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(src);
	
	}

public static WebElement departDateField(WebDriver driver){
	
	element = driver.findElement(By.id("flight-departing-hp-flight"));
	
	return element; 	
	
	}

public static WebElement returnDateField(WebDriver driver){
	
	element = driver.findElement(By.id("flight-returning-hp-flight"));
	
	return element; 	
	
	}


public static void ClickFlightTab(WebDriver driver){
	driver.findElement(By.id("tab-flight-tab-hp")).click();
}


public static void ClickSearchButton(WebDriver driver){
	driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[7]/label/button")).click();
}

}
