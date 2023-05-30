package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddPythonToMyCartTest extends BaseClass {


	@Test 
	public void AddPythonToMyCartTest () {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().contains("ECommerce"));
		
		demoApp.selectCategory(web, 1);
		
		soft.assertEquals(Testing.getPageHeader(), "Testing");
		
		web.scrollTillElement(Testing.getPythonImage());
		web.dragAndDropElement(Testing.getPythonImage(), Testing.getCartArea());
		
		web.scrollTillElement(Testing.getFacebookIcon());
		Testing.clickFacebookIcon();
		
		soft.assertAll();
		
		
		
	}
}

