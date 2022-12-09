package tek.sdet.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.sdet.framework.utilities.CommonUtility;


public class BaseUi extends CommonUtility{
	
	
	
	
	
	@Before
	public void setUpTest() {
		super.setUpBrowser();
	}
	
	
	
	@After
	public void closeTest(Scenario seca) {
		
		if(seca.isFailed()) {
			byte[] screenShot = takeScreenShotAsBytes();
			seca.attach(screenShot, "image/png", seca.getName()+"test failed");
		}
		
		super.quitBrowser();
		
	}
}