package com.fannie.implicitexplicit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fannie.generic.GenericMethod01;

public class ExplicitWait01 {


	private WebDriver driver;
	private String baseURL;
	private GenericMethod01 gm1;


	@Before
	public void setUp() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\Desktop\\selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.baseURL =  "http://cinetalenters.com/#/";
		this.gm1 = new GenericMethod01(this.driver);
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[3]/h4/a[2]/span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		email.sendKeys("lkdfjlsdfkj");
		
		
	}

}
