package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendRequestPage {

//-------- WebElement Declaration ------------
	@FindBy (xpath = "//span[text()='Friends']")
	private WebElement friendTab;
	
	@FindBy (xpath = "(//span[text()='Friend Requests'])[1]")
	private WebElement friendRequestTab;
	
	@FindBy (xpath = "(//span[text()='Confirm'])[27]")
	private WebElement confirmButtonTab;
	
	@FindBy (xpath = "//span[text()='Birthdays']")
	private WebElement birthdayTab;
	
	@FindBy (xpath = "(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[7]")
	private WebElement imglogout;//span[text()='Log Out']
	
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement logoutTab;
	
//------------ Constructor ------------------	
	
	public FriendRequestPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

//------------ Methods -------------------------
	
	
	public void ClickOnFriendTab() throws InterruptedException {
		Thread.sleep(5000);
		friendTab.click();
	}
	
	public void ClickOnFriendRequestTab() throws InterruptedException {
		Thread.sleep(5000);
		friendRequestTab.click();
	}
	
	public void ClickOnConfirmButtonTab() throws InterruptedException {
		Thread.sleep(5000);
		confirmButtonTab.click();
	}
	
	public void ClickOnBirthdayTab() throws InterruptedException {
		Thread.sleep(5000);
		birthdayTab.click();
	}

	public void ClickOnImglogout() throws InterruptedException {
		Thread.sleep(5000);
		imglogout.click();
	}
	
	public void ClickOnLogoutTab() throws InterruptedException {
		Thread.sleep(5000);
		logoutTab.click();
	}
}
