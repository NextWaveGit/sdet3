package com.fannie.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.utility.ScreenShot;

public class PageObjectModel2 {
	
	private static WebDriver driver;
	private FlightPagePOMFactory fac;
	String baseURL;
	
	
	
	@BeforeClass
	public static void beforeClass(){
		driver = DriverFactory.getDriverFacotry("chrome");
	}
	
	@Before
	public void setup(){
		
		//driver = DriverFactory.getDriverFacotry("Chrome");
		fac = new FlightPagePOMFactory(driver);
		baseURL = "http://expedia.com";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		
		String fileName = "sample";
		
		ScreenShot.takeScreenShot(driver, fileName);
		
		//driver.close();
	}

	@Test
	public void test() {
		
		String iad = "Washington, DC (IAD-Washington Dulles Intl.)";
		String pek = "Beijing, China (PEK-Capital Intl.)";
		String startDate = "04/27/2017";
		String returnDate = "05/31/2017";
		
		iad = "New York, NY (JFK-John F. Kennedy Intl.)";
		pek ="San Francisco, CA (QSF-All Airports)";
		
		fac.clickFlightTab();
		fac.sendFlyingFrom(iad);
		fac.sendFlyingTo(pek);
		fac.sendDepartingDate(startDate);
		fac.sendReturnDate(returnDate);
		fac.clickSearchButton1();;
		
	}
}
