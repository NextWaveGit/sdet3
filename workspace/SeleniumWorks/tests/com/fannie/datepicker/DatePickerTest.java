package com.fannie.datepicker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.WaitTypes;

public class DatePickerTest {


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
	public void test() {
		driver.get(baseURL);
		
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		String st1 = "Washington, DC (IAD-Washington Dulles Intl.)";
		
		
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(st1);
		
		String dest = "San Francisco, CA (SFO-San Francisco Intl.)";
		
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(dest);
		
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		
		WebElement srcDate = driver.findElement(
				By.xpath("//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[text()='20']"));
		//*[@id="flight-departing-wrapper-hp-flight"]/div/div/div[2]/table/tbody/tr/td/button[text()='20']
		
		srcDate.click();
		
		
		
		
	}


}
