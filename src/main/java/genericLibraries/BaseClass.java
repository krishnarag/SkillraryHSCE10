package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomClasses.ContactUsPage;
import pomClasses.SeleniumTrainingPage;
import pomClasses.SkillraryDemoAppPage;
import pomClasses.SkillraryHomePage;
import pomClasses.TestingPage;

public class BaseClass {
  
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility web;
	protected WebDriver driver;
	
	protected SkillraryHomePage home;
	protected SkillraryDemoAppPage demoApp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage Testing;
	protected ContactUsPage contact;
	
//@BeforeSuit
	//@BeforeTest
	
	@BeforeClass
	
	public void classConfig() {
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		jutil=new JavaUtility();
		web=new WebDriverUtility ();
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
		
		
	}
	
	@BeforeMethod
	
	public void methodConfig() {
		driver=web.launchBrowser(property.readDataFromProperties("browser"));
		web.maximizeBrowser();
		web.navigateToapp(property.readDataFromProperties("url"));
		web.waitUntilElementFound(Long.parseLong(property.readDataFromProperties("time")));
		
		home=new SkillraryHomePage(driver);
		demoApp=new SkillraryDemoAppPage(driver);
		selenium = new SeleniumTrainingPage(driver) ;
		Testing=new TestingPage(driver);
		contact=new ContactUsPage(driver);
				
	}
	@AfterMethod
	public void methodTearDown() {
		web.quitAllWindows();
		
	}
	
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
		
	}
	
	//AfterTest
	//AfterSuite
}