package com.fannie.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel1 {


	private WebDriver driver;
	private String baseURL;
	private FlightPagePOM wt;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		wt = new FlightPagePOM();
		
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
		
		FlightPagePOM.ClickFlightTab(driver);
		
		String iad = "Washington, DC (IAD-Washington Dulles Intl.)";
		String pek = "Beijing, China (PEK-Capital Intl.)";
		String startDate = "04/27/2017";
		String returnDate = "05/31/2017";
		
		FlightPagePOM.fliyingFromTextBox(driver, iad);
		//FlightPagePOM.fliyingFromTextBox(driver).sendKeys(iad);
		FlightPagePOM.fliyingToTextBox(driver, pek);
		
		//FlightPagePOM.fliyingFromTextBox(driver).sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		//FlightPagePOM.fliyingToTextBox(driver, "San Francisco, CA (QSF-All Airports)");
		//FlightPagePOM.fliyingToTextBox(driver).sendKeys("San Francisco, CA (QSF-All Airports)");
		FlightPagePOM.departDateField(driver).sendKeys("04/27/2017");
		FlightPagePOM.returnDateField(driver).sendKeys("05/31/2017");
		
		Thread.sleep(3000);
		FlightPagePOM.ClickSearchButton(driver);		
		
	}

}
