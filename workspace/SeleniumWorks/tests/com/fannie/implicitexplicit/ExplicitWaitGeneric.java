package com.fannie.implicitexplicit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.WaitTypes;

public class ExplicitWaitGeneric {


	private WebDriver driver;
	private String baseURL;
	private WaitTypes wt;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		wt = new WaitTypes(driver);
		
		this.baseURL =  "http://naveenks.com/selenium/LoginForm.html";
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	//*[@id="flight-departing-wrapper-hp-flight"]/div/div/div[2]/table/tbody/tr[4]/td[4]/button[text()='23']
	
	//*[@id="flight-departing-wrapper-hp-flight"]/div/div/div[2]/table/tbody/tr[2]
	
	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}

	

	@Test
	public void test() {
		driver.get(baseURL);
		
		WebElement email = wt.waitForElement(By.id("uname"), 5);
		WebElement pwd = wt.waitForElement(By.id("pwd"), 6);
		
		email.sendKeys("lksdfj);lasdfkj");
		pwd.sendKeys("slkdfjsld");
		
		wt.clickWhenReady(By.id("submitBtn"), 3);
		driver.findElement(By.id("submitBtn")).click();
		
		
		
	}

}
