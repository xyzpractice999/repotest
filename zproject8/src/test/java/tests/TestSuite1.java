package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.FrameWorkUtils;

public class TestSuite1 {

	@Test
	public void testLogin() { 
		
		LoginPage loginPage= new LoginPage();
		HomePage homePage = new HomePage();
		FrameWorkUtils.setUpDriver();
		BrowserUtils.launchBrowser();
		BrowserUtils.invokeApp();
		loginPage.verifyLoginPage();
		loginPage.performlogin();
		homePage.verifyHomepage();
		homePage.verifyHomepage();
		homePage.logout();
		homePage.logout();
		BrowserUtils.killBrowser();
		
		
	}

}
