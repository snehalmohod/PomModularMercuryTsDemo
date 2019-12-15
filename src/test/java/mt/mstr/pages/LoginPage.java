package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;

public class LoginPage {

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objsignin;
	
	public void loadLoginPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password); 
	}
	public void clickonSignIn()
	{
		objsignin.click(); 
	}
}
