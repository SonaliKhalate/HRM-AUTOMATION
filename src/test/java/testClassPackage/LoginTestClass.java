package testClassPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.LoginPage;
public class LoginTestClass 
{
	WebDriver driver;
	LoginPage login;
	@BeforeClass
	public void beforeClass()
	{
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	login = new LoginPage(driver);
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("BeforeMethodnof Class1");
	}
	@Test
	public void VerifyLoginFunctionalityWithCorrectData()throws InterruptedException
	{
		login.sendUsername("Admin");
		login.sendPassword("admin123");
		login.clickOnLoginButton();
		String ExpectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Thread.sleep(2000);
		String CurrentURL= driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL,ExpectedURL);
	}
	/*   //Hard Assert
	  Assert.assertEquals(CurrentURL,ExpectedURL);
	  Assert.assertNotEquals(CurrentURL,ExpectedURL);
	  Assert.AssertTrue(true);
	  Assert.AssertFalse(False);
	  Assert.fail();
	  
	    //Soft Assert
	   SoftAssert s= new SoftAssert();
	  s.assertEquals(CurrentURL,ExpectedURL);
	  s.assertNotEquals(false, false);
	  s.AssertTrue(true);
	  s.AssertFalse(False);
	  s.assert.fail();*/
}
