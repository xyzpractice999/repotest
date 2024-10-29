package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.FrameWorkUtils;

public class TestSuite5 {

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
		homePage.logout();
		BrowserUtils.killBrowser();
		
		
	}

}
