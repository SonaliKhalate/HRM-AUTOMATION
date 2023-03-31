package testClassPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.Screenshot;
import testUtility.StaticBrowser;
public class BaseClass
{
   static WebDriver driver;
   public static ExtentReports report;
   public static ExtentHtmlReporter extent;
   public static ExtentTest logger;
   @Parameters({"browserName"})
   
   @BeforeTest
   public void beforeTest(String browserName)
   {
	   report= new ExtentReports();
	   extent= new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
	   report.attachReporter(extent);
	   
	   WebDriver driver= StaticBrowser.openBrowser(browserName,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       this.driver=driver;
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @AfterMethod
   public void aftermethod(ITestResult result) throws IOException, InterruptedException
   {
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		   Thread.sleep(2000);
		 String path=  Screenshot.capturePageScreenshot(driver);
		   logger.fail("Test Case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build()) ;//extent report
		   report.flush();
	   }
   }
   @AfterTest
   public void afterTest()
   {
   }
}
