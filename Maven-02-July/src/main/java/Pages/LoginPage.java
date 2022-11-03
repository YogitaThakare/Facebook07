package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	@FindBy(xpath = "//input[@id='email']" ) 
	private WebElement userEmail;
	
	@FindBy(xpath = "//input[@type='password']" ) 
	private WebElement userPassword;
	
	@FindBy(xpath = "//button[@name='login']" ) 
	private WebElement loginButton;
	
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement createNweAccountButton;
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement goToMessenger;

//--------------- Constructor -----------------
	
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//----------------- Method ------------------------
	
	public void sendUserEmail() {
		userEmail.sendKeys("kashishyog@gmail.com");
	}
	
	public void sendUserPassword() {
		userPassword.sendKeys("rajyog@kushu");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void clickOnCreateNweAccountButton() {
		createNweAccountButton.click();
	}
	
	public void clickOngoToMessenger() {
		goToMessenger.click();
	}
}
