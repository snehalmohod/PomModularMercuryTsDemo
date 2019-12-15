package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;

public class FlightFinderPage {

	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlighterpage;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void loadFlightFinderPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyFlightFinderPage()
	{
		System.out.println("FlightFinder page is displayed");
		boolean flag=objFlighterpage.isDisplayed();
		System.out.println("Flight Finder page icon is displayed :"+flag);
	}
	public void clickOnSignoff()
	{
		objsignoff.click();
	}
	
	
}
