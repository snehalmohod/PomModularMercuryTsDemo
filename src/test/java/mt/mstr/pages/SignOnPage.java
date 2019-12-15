package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;

public class SignOnPage {
@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_signon.gif']")
WebElement objsignon;

public void loadSignOnPage()
{
	PageFactory.initElements(Config.driver, this);
}
public void verifysignOnPage()
{
	boolean flag=objsignon.isDisplayed();
	System.out.println("Sign On Page is Displayed :"+flag);
}
}
