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

import Pages.FriendRequestPage;
import Pages.LoginPage;
import setup.Base;


public class TestNGVerifyFriendsTab extends Base{
	private WebDriver driver;
	private FriendRequestPage frdreq;
	private LoginPage logIn;
	private SoftAssert soft ;
	
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
	 public void beforeClass() {
		logIn = new LoginPage(driver);
		frdreq = new FriendRequestPage(driver);
	}
	
	@BeforeMethod
	 public void beforeMethod() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		//logIn = new LoginPage(driver);
		logIn.sendUserEmail();
		logIn.sendUserPassword();
		logIn.clickOnLoginButton();
		soft = new SoftAssert();
	}
	
	@Test
	 public void test1() throws InterruptedException {
		System.out.println("Test 1");
		
		//frdreq = new FriendRequestPage(driver);
		frdreq.ClickOnFriendTab();
		frdreq.ClickOnFriendRequestTab();
//		frdreq.ClickOnConfirmButtonTab();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		soft.assertEquals(url, "https://www.facebook.com/friends");
		soft.assertEquals(title, "(3) Friends | Facebook");
		
		soft.assertAll();
		
//		if(url.equals("https://www.facebook.com/friends/requests") && title.equals("Friend Requests | Facebook"))
//		{
//			System.out.println("PASSED");
//		}
//		else
//		{
//			System.out.println("FAILED");
//		}
	}
	
	@Test
	 public void test2() throws InterruptedException {
		System.out.println("Test 2");
		
		frdreq.ClickOnFriendTab();
		frdreq.ClickOnBirthdayTab();
	}
	
	@AfterMethod
	 public void afterMethod() throws InterruptedException {
		System.out.println("After Method");	
		frdreq.ClickOnImglogout();
		frdreq.ClickOnLogoutTab();
	}
	
	@AfterClass
	 public void afterClass() throws InterruptedException {
		System.out.println("After Class");
		logIn = null;
		frdreq = null;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}
}
