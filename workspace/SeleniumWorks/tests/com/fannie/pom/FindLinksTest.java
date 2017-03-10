package com.fannie.pom;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindLinksTest {

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
		//driver.close();
	}

	@Test
	public void test() {
		List<WebElement> list = clickableLinks(driver);
		
		for(WebElement temp : list){
			//System.out.println(temp.getText());
			String href = temp.getAttribute("href");
			
				try {
					System.out.println("URL "+ href + " response "+linkStatus(new URL(href)));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		}
	

	
	public static List<WebElement>clickableLinks(WebDriver driver){
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		
		List<WebElement> anchorElements = driver.findElements(By.tagName("a"));
		anchorElements.addAll(driver.findElements(By.tagName("img")));
		
		for (WebElement temp:anchorElements){
			if(temp.getAttribute("href")!= null){
				linksToClick.add(temp);
				
			}
		}
		
		return linksToClick;
	}
	
	public static String linkStatus(URL url) {
		
		HttpURLConnection httpConnection;
		
		String responseMessage;
		try {
			httpConnection = (HttpURLConnection) url.openConnection();
			
			httpConnection.connect();
			responseMessage = httpConnection.getResponseMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		httpConnection.disconnect();
		
		return responseMessage;
	}

}
