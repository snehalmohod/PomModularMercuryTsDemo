package mt.mstr.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import mt.mstr.config.Config;

public class LaunchApp {

public void openBrowser(String browsernm) throws IOException
{
	      if(browsernm.equalsIgnoreCase("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
            Config.driver=new ChromeDriver();
      }
      else if(browsernm.equalsIgnoreCase("ie"))
      { 
    	  System.setProperty("webdriver.ie.driver", "E:\\11092019\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
           Config.driver=new InternetExplorerDriver();
      }
      else
      {
    	  System.setProperty("webdriver.gecho.driver", "E:\\11092019\\geckodriver-v0.25.0-win64\\geckodriver.exe");
      }

}
public void enterURL(String url)
{
	Config.driver.get(url);
}
public void maximizeBrowser()
{
	Config.driver.manage().window().maximize();
}
public void waituntilpageload(int timeout)
{
	Config.driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
}

}
