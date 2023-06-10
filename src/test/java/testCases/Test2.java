package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.Add2cartpage;
import pageFactory.Departmentpage;
import pageFactory.Homepage;
import pageFactory.Itemspage;
import pageFactory.Itemsublistpage;
import pageFactory.Sucessmsgpage;
import testBase.TestBase;

public class Test2 extends TestBase{
	@Test
	public void testCase2() throws Throwable{
		
		hp.clickondontchange();
		hp.clickontodaysdeal();
		dp.selectcheckbox("furniture");
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
		acp.clickonadd2cart();
		sp.verifysucessmsg();
		
	
	}
}
