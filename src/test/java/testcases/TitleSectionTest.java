package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.HomeScreen;
import screens.LoginScreen;
import utilities.ScrollUtil; 

public class TitleSectionTest extends TestBase {
	
	LoginScreen login;
	HomeScreen home;
	
	
	@BeforeTest
	public void init() {
		
		setUp();
		login = new LoginScreen(driver);
		home = new HomeScreen(driver);

	}
	
	@Test
	public void validateTitle() throws InterruptedException {
		
		Thread.sleep(3000);
		
		login.clickGetStartedBtn().chooseTopics(4).clickContinue().skipLogin();
		home.gotoTitleSection(2);
		//takeScreenshot();
		
		Thread.sleep(3000);
		ScrollUtil.scrollUp(2, driver);
	}
	
	@AfterTest
	public void quitDriver() {
		
		quit();
	}

}
