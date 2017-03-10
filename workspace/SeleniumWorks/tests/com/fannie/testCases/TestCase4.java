package com.fannie.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {


	ChromeDriver driver;
	String baseURL;
	String baseURL1;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "http://expedia.com";
		baseURL1 = "http://html.com/attributes/select-multiple/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}




	//@Test
	public void test() throws InterruptedException{
		driver.get(baseURL);

		WebElement element1 = driver.findElement(By.id("package-rooms-hp-package"));

		Select select1 = new Select(element1);

		List<WebElement> options = select1.getOptions();

		System.out.println("Number of options for elemtn1 "+ options.size());

		for(int i=0; i<options.size();i++){
			System.out.println(select1.getOptions().get(i).getText());
		}


		select1.selectByValue("2");;
		select1.selectByIndex(2);
	}



	@Test
	public void multiSelectTest() throws InterruptedException{
		driver.get(baseURL1);



		WebElement el = driver.findElement(By.xpath("//*[@id='wrapper']/article/section/div[2]/select"));		

		Select select = new Select(el);

		select.selectByValue("American");
		select.selectByValue("Greater");

		Thread.sleep(3000);

		select.deselectByValue("American");

		Thread.sleep(3000);

		select.deselectByValue("Greater");

		Thread.sleep(3000);

		select.selectByIndex(2);

	}
}

//package-1-adaults-hp-package 
//package-1-children-hp-package