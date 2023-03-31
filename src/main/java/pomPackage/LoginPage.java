package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.ElementWait;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername(String uName)
	{
		ElementWait.waitForElement("//input[@name='username']", 20, driver);
		username.sendKeys(uName);
	}
	
	public void sendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
