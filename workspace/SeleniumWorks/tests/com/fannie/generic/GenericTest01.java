package com.fannie.generic;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericTest01 {


	private WebDriver driver;
	private String baseURL;
	private GenericMethod01 gm1;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.baseURL =  "http://naveenks.com/selenium/RegForm.html";
		this.gm1 = new GenericMethod01(this.driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
		//driver.quit();
	}



	//@Test
	public void test() throws InterruptedException {

		this.driver.get(baseURL);
		WebElement inputElement = gm1.getElement("inputEmail", "id");

		inputElement.sendKeys("jone@gmail.com");

		gm1.getElement("inputPassword", "id").sendKeys("hello");
		gm1.getElement("confirmPassword", "id").sendKeys("hi");

		Thread.sleep(2000);

		inputElement.clear();
		inputElement.sendKeys("skdjfldskj");


		gm1.getElement("/html/body/div[1]/form/div[13]/div/input[1]", "xpath").click();
	}


	@Test
	public void test1() throws InterruptedException {

		this.driver.get(baseURL);
		WebElement inputElement = gm1.getElement("inputEmail", "id");

		inputElement.sendKeys("jone@gmail.com");

		if(gm1.checkSingle("inputPassword", "id")){
			gm1.getElement("inputPassword", "id").sendKeys("hello");
		}
		gm1.getElement("confirmPassword", "id").sendKeys("hi");

		Thread.sleep(2000);

		inputElement.clear();
		inputElement.sendKeys("skdjfldskj");


		gm1.getElement("/html/body/div[1]/form/div[13]/div/input[1]", "xpath").click();
	}


}
