package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.ChooseTopicsScreen;
import screens.LoginScreen;

public class FlipboardLoginTest extends TestBase {
	
	LoginScreen login;
	ChooseTopicsScreen topicScreen;

	@BeforeTest
	public void init() {
		
		setUp();
		login = new LoginScreen(driver);
		topicScreen = new ChooseTopicsScreen(driver);

	}
	
	@Test(priority=1)
	public void validateGetStartedButton() {
		
		login.clickGetStartedBtn();
	}
	
	@Test(priority=2)
	public void chooseTopicsTest() {
		
		topicScreen.chooseTopics(4).clickContinue();
		//topicScreen.clickContinue();
	}
	
	@AfterTest
	public void quitDriver() {
		
		quit();

	}

}
