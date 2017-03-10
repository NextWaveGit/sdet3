package com.fannie.testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {


	ChromeDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}

//	@Test
	public void clickTestRadioCheck() throws InterruptedException{
		driver.get(baseURL);

		WebElement genderMale = driver.findElement(By.id("genderMale"));

		genderMale.click();

		Thread.sleep(1000);

		WebElement genderFemale = driver.findElement(By.id("genderFemale"));

		genderFemale.click();

		Thread.sleep(1000);


		WebElement genderTrans = driver.findElement(By.id("genderTrans"));

		genderTrans.click();

		Thread.sleep(1000);

		System.out.println("Male clicked "+ genderMale.isSelected());

		System.out.println("Female clicked "+ genderFemale.isSelected());

		System.out.println("Trans clicked "+ genderTrans.isSelected());

	}

	@Test
	public void clickCheckbox() throws InterruptedException{
		driver.get(baseURL);

		WebElement news = driver.findElement(By.id("news"));

		news.click();

		Thread.sleep(1000);

		WebElement tech = driver.findElement(By.id("tech"));

		tech.click();;

		Thread.sleep(1000);


		WebElement third = driver.findElement(By.xpath("/html/body/div[1]/form/div[12]/div/label/input"));

		third.click();
		
		tech.click();

		WebElement sub = driver.findElement(By.xpath("/html/body/div[1]/form/div[13]/div/input[1]"));
		
		System.out.println(sub.getAttribute("value"));  
	}



}

