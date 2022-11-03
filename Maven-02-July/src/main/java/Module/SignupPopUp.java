package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPopUp {
	
//=========== Variable or WebElement Declaration =========================
	//a[text()='Create New Account']
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement userFirstName;
	
	@FindBy (xpath = "//input[@name='lastname'")
	private WebElement userLastName;
	
	@FindBy (xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement userEmailOrMobile;

	@FindBy (xpath = "//input[@id='password_step_input']")
	private WebElement userPassword;
	
	@FindBy (xpath = "//select[@id='day']")
	private WebElement userDateOfDay;
	
	@FindBy (xpath = "//select[@id='month']")
	private WebElement userDateOfMonth;//DropDown;
	
	@FindBy (xpath = "//select[@id='year']")
	private WebElement userDateOfYear;
	
	
	@FindBy (xpath = "")
	private WebElement userGender;
	
	@FindBy (xpath = "")
	private WebElement signUpButton;
	
//=========== Constructor Initialization =========================
	
	public SignupPopUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//===========Methods Actions on WebElement  =========================	//createNewAccount
	
	public void clickOnCreateNewAccount() {
		createNewAccount.click();
	}
	
	public void snedUserFirstName() {
		userFirstName.sendKeys("Yogita");
	}
	
	public void snedUserLastName() {
		userLastName.sendKeys("Thakare");
	}
	public void snedUserEmailOrMobile() {
		userEmailOrMobile.sendKeys("");
	}
	public void snedUserPassword() {
		userPassword.sendKeys("");
	}
	public void sneduserDateOfDay() {
//		Select s = new Select(userDateOfDay);
//		s.selectByVisibleText("11");
		userDateOfDay.sendKeys("");
	}
	
	public void sneduserDateOfMonth() {
//		Select d = new Select(sneduserDateOfMonth);
//		d.selectByValue("Jun");
		userDateOfMonth.sendKeys("");
	}
	
	public void snedUserDateOfYear() {
//		Select d = new Select(sneduserDateOfYear);
//		d.selectByValue("Jun");
		userDateOfYear.sendKeys("");
	}
	public void tickUserGender() {
		userGender.click();
	}
	
	public void clickOnSignUpButton() {
		signUpButton.click();
	}
	
	
}
