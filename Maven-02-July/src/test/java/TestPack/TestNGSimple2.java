package TestPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGSimple2 {

	@Parameters("browser")
	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("Before Test FlipKart");
	  }
	 
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class FlipKart");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method FlipKart");
	  }
	  
	  @Test
	  public void testA() {
		  System.out.println("Test ABC FlipKart");
	  }
	  
	  @Test
	  public void testB() {
		  System.out.println("Test XYZ FlipKart");
	  }
	  @Test
	  public void testC() {
		  System.out.println("Test PQR FlipKart");
	  }
	  
	  @Test
	  public void testD() {
		  System.out.println("Test LMN FlipKart");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method FlipKart");
	  }


	  @AfterClass
	  public void afterClass() {
		  System.out.println("Aftetr Class FlipKart");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Tets FlipKart");
	  }



}
