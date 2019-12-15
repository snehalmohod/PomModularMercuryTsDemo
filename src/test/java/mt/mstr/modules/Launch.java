package mt.mstr.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.utility.LaunchApp;

public class Launch {

	@Parameters({"browser","url","timeouts"})
	@Test
	public void executeLaunch(String browsernm,String url,int timeouts) throws IOException
	{
		LaunchApp lpp=new LaunchApp();
		lpp.openBrowser(browsernm);
		lpp.enterURL(url);
		lpp.waituntilpageload(timeouts);
		lpp.maximizeBrowser();
		
	}
}
