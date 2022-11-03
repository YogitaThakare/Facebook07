package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginPage;
import Pages.MessengerPage;
import Pages.RoomsPage;
import setup.Base;

public class TestNGVerifyRoomsPage extends Base{
	WebDriver driver;
	LoginPage loginPage;
	MessengerPage messengerPage;
	RoomsPage roomsPage;
	SoftAssert soft;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = chromeBrowser();
		}
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = firefoxBrowser();
		}
		
		if(browser.equalsIgnoreCase("edge")) {
			driver = edgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void roomsPage() {
		loginPage = new LoginPage(driver);
		messengerPage = new MessengerPage(driver);
		roomsPage = new RoomsPage(driver);
	}
	
	@BeforeMethod
	public void openRoomsPage() {
		System.out.println("Before Method");
		
		driver.get("https://www.facebook.com/");
		//loginPage = new LoginPage(driver);
		loginPage.clickOngoToMessenger();
		//messengerPage = new MessengerPage(driver);
		messengerPage.clickOnRoomsTab();
		//roomsPage = new RoomsPage(driver);	
		soft = new SoftAssert();
	}
	@Test
	public void verifyToReturnToMessengerButton() {
		System.out.println("Test 1");
		roomsPage.returnToMessenger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		soft.assertEquals(url, "https://www.messenger.com/");
		soft.assertEquals(title, "Messenger");
		
		soft.assertAll();
		
//		if(url.equals("https://www.messenger.com/") && title.equals("Messenger")){
//			System.out.println("PASSED");
//		}else{
//			System.out.println("FAILED");
//		}
	}
	@Test
	public void verifyGoBackToToHelpCenterButton() {
		System.out.println("Test 2 ");
		roomsPage.goBackToToHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger Help Centre");
		
		soft.assertAll();
		
//		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")){
//			System.out.println("PASSED");
//		}else{
//			System.out.println("FAILED");
//		}	
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void clearMethods() {
		System.out.println("After Class");
		loginPage = null;
		messengerPage = null;
		roomsPage = null;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}	
}
