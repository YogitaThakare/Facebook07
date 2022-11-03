package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	
	@FindBy (xpath="//a[text()=' Return to messenger.com ']")
	private WebElement returnButton;
	
	@FindBy(xpath = "//a[text()=' Visit our help center ']")
	private WebElement contactToHelpCenter;
	
//---------- Constructor ---------------
	
	public RoomsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//--------- Methods - Actions ---------------
	
	public void returnToMessenger() {
		returnButton.click();
	}
	
	public void goBackToToHelpCenter() {
		contactToHelpCenter.click();
	}
	
}
