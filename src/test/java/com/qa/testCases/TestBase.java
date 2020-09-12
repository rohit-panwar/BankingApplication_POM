package com.qa.testCases;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public String url="http://demo.guru99.com/v4/index.php";
	public String username="mngr284623";
	public String password="anujabU";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
