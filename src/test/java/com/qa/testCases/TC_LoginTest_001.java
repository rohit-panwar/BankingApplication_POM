package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageObjects.LoginPage;

public class TC_LoginTest_001 extends TestBase{

	@Test
	public void loginTest() {
		driver.get(url);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
		
		if(driver.getTitle().equals("http://demo.guru99.com/v4/manager/Managerhomepage.php"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
}
