package testClassPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.LoginPage;
import testUtility.ReadFileData;

public class TestClassTNG2 extends BaseClass
{
	ReadFileData r;
	//WebDriver driver;
	LoginPage login;
	@BeforeClass
	public void beforeClass()
	{
	login = new LoginPage(driver);
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("BeforeMethodnof Class1");
	}
	@Test
	public void VerifyLoginFunctionalityWithCorrectData()throws InterruptedException, EncryptedDocumentException, IOException
	{
		logger = report.createTest("VerifyLoginFunctionalityWithCorrectData");   //extent repoet
		
		login.sendUsername(r.fetchDataFromExcel(1,0));
		login.sendPassword(r.fetchDataFromExcel(1,1));
		login.clickOnLoginButton();
	//	String ExpectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	//	Thread.sleep(2000);
	//	String CurrentURL= driver.getCurrentUrl();
	//	Assert.assertEquals(CurrentURL,ExpectedURL);
	}
		@Test
		public void wrongUserNamePassword()
		{
			logger = report.createTest("wrongUserNamePassword");   //extent report

			Assert.fail();
			System.out.println("testclasshome 3");
		}
    
		@AfterClass
		public void afterClass()
		{
			System.out.println("after class3");

		}
}
