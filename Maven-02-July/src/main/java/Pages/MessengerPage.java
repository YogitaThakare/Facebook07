package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
//-------------- Variables - WebElement(Declaration) -------------- 
		@FindBy(xpath = "//a[text()='Rooms']" ) 
		private WebElement roomTab;
		
		@FindBy(xpath = "//a[text()='Features']" ) 
		private WebElement featuresTab;
		
		@FindBy(xpath = "//a[text()='Desktop app']" ) 
		private WebElement desktopAppTab;
		
//--------------  Constructor Initialization -------------- 	
		
		public MessengerPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
//-------------- Methods - Actions on WebElent -------------- 
		
		public void clickOnRoomsTab() {
			roomTab.click();
		}
		
		public void clickOnFeaturesTab() {
			featuresTab.click();
		}
		
		public void clickOnDesktopAppTab() {
			desktopAppTab.click();
		}

}




//a[text()='Desktop app']