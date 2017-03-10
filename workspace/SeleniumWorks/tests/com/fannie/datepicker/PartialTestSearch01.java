package com.fannie.datepicker;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.WaitTypes;

public class PartialTestSearch01 {


	private WebDriver driver;
	private String baseURL;
	private WaitTypes wt;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		wt = new WaitTypes(driver);
		
		this.baseURL =  "http://expedia.com";
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	
	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}

	

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		String partialString = "new yor";
		
		// assume that we are connecting to DB to get he list of 
		// airports or cities which we want 
		String location="New York, NY (JFK-John F. Kennedy Intl.)";
		
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(partialString);
		
		// xpath for li of items -> //li[@class="results-item"]
		
		List<WebElement> elements = 
			driver.findElements(By.xpath("//li[@class='results-item']"));
		
		System.out.println("Locations got is -> " + elements.size());
		for(WebElement element: elements){
			System.out.println(element.getText());
		}
		
		Thread.sleep(2000);
		
//		for(WebElement element : elements){
//			if(element.getText().equals(location)){
//				element.click();
//			}
//		}
		
		for(WebElement element : elements){
			if(element.getText().startsWith("New York")){
				element.click();
			}
			
		}
		
	}

}
