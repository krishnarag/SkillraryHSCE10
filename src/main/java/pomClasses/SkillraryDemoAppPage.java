package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement categoryDD;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	/**
	 * this method returns page header text
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
		}
	/**
	 * this method is used to mouse hover to course to course tab
	 * @param web
	 */
	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	/**
	 * this method is used to click on Selenium training
	 */
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	/**
	 * this method is used to select category
	 * @param web
	 * @param index
	 *
	 */
	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDD, index);
	}
	/**
	 * this method returns contact us link
	 * @return
	 */
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	/**
	 * this method is used to click on contact us link
	 */
	public void clickContactUs() {
		contactUsLink.click();
	}
	}

