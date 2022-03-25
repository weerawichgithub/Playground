package test;

import driver.Driver;
import org.testng.annotations.*;
import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class CRW001_CustomerLoginTesting extends commonMethods{

	@BeforeTest
	public void launchBrowser() {
		Driver.getDriver();
	}

	@Test
	public void test() {
		printMsg("phpTravel testCase");
		//Login with valid username and password
		custPage.usernameLoginInput.sendKeys(PropertiesReader.getProperty("customerEmail"));
		custPage.passwordLoginInput.sendKeys(PropertiesReader.getProperty("customerPassword"));
		custPage.loginButton.click();
	}

	@AfterTest
	public void afterTest() {
		Driver.tearDown();
	}
}
