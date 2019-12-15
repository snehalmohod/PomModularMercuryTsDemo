package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderPage;
import mt.mstr.pages.LoginPage;
import mt.mstr.pages.SignOnPage;
import mt.mstr.utility.CloseBrowser;

public class Login {

	@Parameters({"username","password"})
	@Test(priority=1)
	public void loginwithValidDetails(String username,String password)
	{
		LoginPage lgp=new LoginPage();
		lgp.loadLoginPage();
		lgp.enterUsername(username);
		lgp.enterPassword(password);
		lgp.clickonSignIn();
		FlightFinderPage ffp=new FlightFinderPage();
		ffp.loadFlightFinderPage();
		ffp.verifyFlightFinderPage();
		ffp.clickOnSignoff();
		SignOnPage sp=new SignOnPage();
		sp.loadSignOnPage();
		sp.verifysignOnPage();
		
		/*CloseBrowser cb=new CloseBrowser();
		   cb.closeBroser();*/
	}
	@Parameters({"username","password"})
	@Test(priority=3)
	public void loginwithValidDetails1(String username,String password)
	{
		LoginPage lgp=new LoginPage();
		lgp.loadLoginPage();
		lgp.enterUsername(username);
		lgp.enterPassword(password);
		lgp.clickonSignIn();
		FlightFinderPage ffp=new FlightFinderPage();
		ffp.loadFlightFinderPage();
		ffp.verifyFlightFinderPage();
		ffp.clickOnSignoff();
		SignOnPage sp=new SignOnPage();
		sp.loadSignOnPage();
		sp.verifysignOnPage();
		
		CloseBrowser cb=new CloseBrowser();
		   cb.closeBroser();
	}
	
	
	@Parameters({"username","password"})
	@Test(priority=2)
	public void loginwithInValidDetails(String username,String password)
	{
		LoginPage lgp=new LoginPage();
		lgp.loadLoginPage();
		lgp.enterUsername(username);
		lgp.enterPassword(password);
		lgp.clickonSignIn();
		
		SignOnPage sp=new SignOnPage();
		sp.loadSignOnPage();
		sp.verifysignOnPage();
		
		CloseBrowser cb=new CloseBrowser();
		   cb.closeBroser();
	}
}
	
	
	
	
	






